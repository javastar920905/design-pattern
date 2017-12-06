package intercepterfilterpattern;


import com.javastar920905.intercepterfilterpattern.Client;
import com.javastar920905.intercepterfilterpattern.FilterManager;
import com.javastar920905.intercepterfilterpattern.Target;
import com.javastar920905.intercepterfilterpattern.filterimpl.AuthorizenFilter;
import com.javastar920905.intercepterfilterpattern.filterimpl.DebugFilter;

/**
 * Created by ouzhx on 2016/12/26.
 */
public class TestDemo {
  public static void main(String[] args) {
    // Target - Target 对象是请求处理程序。
    // 过滤器（Filter） - 过滤器在请求处理程序执行请求之前或之后，执行某些任务。
    // 过滤管理器（Filter Manager） - 过滤管理器管理过滤器和过滤器链。
    FilterManager filterManager = new FilterManager(new Target());
    filterManager.setFilter(new AuthorizenFilter());
    filterManager.setFilter(new DebugFilter());

    // 客户端（Client） - Client 是向 Target 对象发送请求的对象。
    Client client = new Client();
    client.setFilterManager(filterManager);
    client.sendRequest("sent  msg!");
  }
}
