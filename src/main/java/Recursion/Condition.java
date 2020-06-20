package Recursion;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author liliang
 * @Date 2020/6/2 17:55
 * @Description
 **/
public class Condition {

    private String joinCondition;

    private boolean status;

    private List<Condition> subConditionList = new ArrayList<Condition>();

    public Condition(String joinCondition, boolean status) {
        this.joinCondition = joinCondition;
        this.status = status;
    }

    public String getJoinCondition() {
        return joinCondition;
    }

    public void setJoinCondition(String joinCondition) {
        this.joinCondition = joinCondition;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Condition> getSubConditionList() {
        return subConditionList;
    }

    public void setSubConditionList(List<Condition> subConditionList) {
        this.subConditionList = subConditionList;
    }

    public void add(Condition condition){
        if (condition != null){
            subConditionList.add(condition);
        }
    }
}
