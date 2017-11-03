package com.javastar920905.proxy.jdk.custom;

import sun.reflect.CallerSensitive;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;

/**
 * Created by ouzhx on 2017/11/3.
 * 生成代理对象代码
 */
public class CustomProxy {
    private static String ln = "\r\n";
    protected CustomInvotationHandler h;

    @CallerSensitive
    public static Object newProxyInstance(CustomClassLoader loader, Class<?>[] interfaces,
        CustomInvotationHandler h) {

        try {
            //1 生成源代码
            String proxySrc = generateSrc(interfaces[0]);

            //2 生成的代码输出到磁盘,保存为.java文件
            //生成的文件路径  design-pattern\vip-proxy\build\classes\main\com\javastar920905\jdk\custom
            String filePath = CustomProxy.class.getResource("").getPath();
            File file = new File(filePath + "$Proxy0.java");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(proxySrc);
            fileWriter.flush();
            fileWriter.close();
            //3 编译源代码,生成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task =
                compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();
            //4 将class文件内容,动态加载到JVM

            //5 返回被代理后的对象 目前写死的..
            Class proxyClass= loader.findClass("$Proxy0");
            Constructor constructor=proxyClass.getConstructor(CustomInvotationHandler.class);
            file.delete();
            return constructor.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param interfaces 生成.java文件内容 (待完善)
     *                   <p>
     *                   仿照生成的.class文件生成代码
     *                   //从内存中反编译字节码
     *                   byte[] data = ProxyGenerator.generateProxyClass("$Proxy0", new Class[] {Person.class});
     *                   <p>
     *                   //写出到文件,然后使用反编译工具(或者idea)查看$Proxy0.class
     *                   try {
     *                   FileOutputStream fileOutputStream = new FileOutputStream("D://$Proxy0.class");
     *                   fileOutputStream.write(data);
     *                   fileOutputStream.close();
     *                   } catch (Exception e) {
     *                   e.printStackTrace();
     *                   }
     * @return
     */
    private static String generateSrc(Class<?> interfaces) {
        StringBuilder src = new StringBuilder();
        src.append("package com.javastar920905.jdk.custom;" + ln);
        src.append("import java.lang.reflect.Method;" + ln);
        src.append("public class $Proxy0 implements " + interfaces.getName() + " {" + ln);
        src.append("CustomInvotationHandler h;" + ln);
        src.append("public $Proxy0(CustomInvotationHandler h){" + ln);
        src.append("this.h=h" + ln);
        src.append("}" + ln);

      /*  for (Method method : interfaces.getMethods()) {
            src.append(
                "public " + method.getReturnType().getName() + " " + method.getName() + "() ");
            src.append(
                "Method m" + interfaces.getName() + ".class.getMethod(\"" + method.getName() + "\")"
                    + "");
            if (method.getReturnType().getName().equalsIgnoreCase("void")) {
                src.append("this.h.invoke(this,m,null);" + ln);
            } else {
                src.append("retrun this.h.invoke(this,m,null);" + ln);
            }
            src.append("}" + ln);
        }*/
        src.append("}");
        return src.toString();
    }


}
