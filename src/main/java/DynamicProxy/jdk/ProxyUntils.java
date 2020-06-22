package DynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author liliang
 * @Date 2020/5/7 15:03
 * @Description
 **/
public class ProxyUntils {

    public static Object getInstance(final Object o){
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true"); //设置系统属性
        return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), new InvocationHandler() {

            /**
             * @param proxy  生成的代理对象
             * @param method  代理的方法
             * @param args   代理方法的参数
             * @return
             * @throws Throwable
             */
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName()+"方法开始执行啦...");
                Object invoke = method.invoke(o, args);
                System.out.println(method.getName()+"方法执行结束啦...");
                return invoke;
            }
        });
    }
}
