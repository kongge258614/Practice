package DynamicProxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author liliang
 * @Date 2020/5/7 16:59
 * @Description
 **/
public class AtmInterceptor implements MethodInterceptor {
    /**
     * obj：cglib生成的代理对象
     * method：被代理对象方法
     * args：方法入参
     * methodProxy: 代理方法
     */
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("事务开始");
        Object result = methodProxy.invokeSuper(obj, args);
        System.out.println(result);
        System.out.println("事务结束");
        return result;
    }
}
