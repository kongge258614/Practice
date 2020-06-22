package DynamicProxy.cglib;

/**
 * @Author liliang
 * @Date 2020/5/7 16:57
 * @Description
 **/
public class Atm {
    public String withdraw(double amount) {
        return "取出"+ amount +"元";
    }

    public String checkBalance() {
        return "当前余额:" + 1200 + "元";
    }
}
