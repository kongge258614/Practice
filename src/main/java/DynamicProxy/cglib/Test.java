package DynamicProxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @Author liliang
 * @Date 2020/5/7 17:02
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        //class 文件缓存目录，如果不研究动态类的源码可以不设置
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\MyWorkspace\\practice\\cglib_classes");
        //用于创建代理对象的增强器，可以对目标对象进行扩展
        Enhancer enhancer = new Enhancer();
        //将目标对象设置为父类
        enhancer.setSuperclass(Atm.class);
        //设置目标拦截器
        enhancer.setCallback(new AtmInterceptor());
        // 创建代理对象
        Atm atm = (Atm)enhancer.create();
        // 通过代理对象调用目标方法
        Object result = atm.withdraw(100);
        atm.checkBalance();
    }
}
