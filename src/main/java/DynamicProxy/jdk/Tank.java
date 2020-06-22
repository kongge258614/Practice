package DynamicProxy.jdk;

/**
 * @Author liliang
 * @Date 2020/5/7 15:01
 * @Description
 **/
public class Tank  implements Moveable{
    public void moveable() {
        System.out.println("Tank move ............");

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fire() {
        System.out.println("Tank fire ............");

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
