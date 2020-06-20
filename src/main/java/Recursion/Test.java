package Recursion;

/**
 * @Author liliang
 * @Date 2020/6/2 20:00
 * @Description
 **/
public class Test {

    public static void main(String[] args) {

        boolean finish = isFinish(condition());
        System.out.println("完成状态："+ finish);
    }

    private static boolean isFinish(Condition c){
        if (c.getSubConditionList() == null || c.getSubConditionList().isEmpty()){
            return c.isStatus();
        }else if (!c.isStatus()){
            return c.isStatus();
        }else {
            boolean finish = ("&&".equals(c.getJoinCondition()));
            boolean isAnd = ("&&".equals(c.getJoinCondition()));
            for (Condition condition:c.getSubConditionList()){
                if (isAnd){
                    finish = finish && isFinish(condition);
                    if (!finish){
                        break;
                    }
                }else{
                    finish = finish || isFinish(condition);
                    if (finish){
                        break;
                    }
                }

            }
            return finish;
        }

    }

    static Condition condition(){

        Condition c111 = new Condition("&&",false);
        Condition c112 = new Condition("&&",true);
        Condition c11 = new Condition("&&",true);
        c11.add(c111);
        c11.add(c112);

        Condition c12 = new Condition("&&",true);

        Condition c1 = new Condition("&&",true);
        c1.add(c11);
        c1.add(c12);

        Condition c21 = new Condition("&&",false);
        Condition c22 = new Condition("&&",true);

        Condition c2 = new Condition("||",false);
        c2.add(c21);
        c2.add(c22);

        Condition dummyCondition = new Condition("||",true);
        dummyCondition.add(c1);
        dummyCondition.add(c2);

        return dummyCondition;
    }


}
