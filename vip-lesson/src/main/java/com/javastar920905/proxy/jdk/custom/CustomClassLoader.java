package com.javastar920905.proxy.jdk.custom;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by ouzhx on 2017/11/3.
 * 代码生成,编译,重新加载到jvm
 */
public class CustomClassLoader extends ClassLoader {
    private File baseDir;

    public CustomClassLoader() {
        String basePath = CustomClassLoader.class.getResource("").getPath();
        this.baseDir = new File(basePath);
    }

    @Override protected Class<?> findClass(String name) throws ClassNotFoundException {
        //找到.class文件加载到jvm
        String classname = CustomClassLoader.class.getPackage().getName() + "." + name;
        if (baseDir != null) {
            File classFile = new File(baseDir, name.replaceAll("\\.", "/") + ".class");
            if (classFile.exists()) {
                FileInputStream in = null;
                try (ByteArrayOutputStream out = new ByteArrayOutputStream()) {
                    in = new FileInputStream(classFile);
                    byte[] buff = new byte[1024];
                    int len;
                    while ((len = in.read(buff)) != -1) {
                        out.write(buff, 0, len);
                    }


                    return defineClass(classname, out.toByteArray(), 0, out.size());
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (null != in) {
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    classFile.delete();
                }

            }
        }

        return super.findClass(name);
    }
}
