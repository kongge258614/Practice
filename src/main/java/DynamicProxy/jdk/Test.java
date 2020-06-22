package DynamicProxy.jdk;

/**
 * @Author liliang
 * @Date 2020/5/7 15:09
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Moveable instance = (Moveable) ProxyUntils.getInstance(tank);
        instance.moveable();

    }
}
