package calculator.v2;
import calculator.v2.operation.Operator;

import java.util.LinkedList;
import java.util.List;

public class CalculatorV21 implements Calculator{

    private List<Long> resList = new LinkedList<>();
    private Operator operator = new Operator();
    private long num1;
    private long num2;
    private char c;

    @Override
    public void getValues() {
        Long res = resList.get(resList.size()-1);
        if(res!=null){
            System.out.println(res);
        }
    }

    @Override
    public void getList() {
        System.out.println("oldValue<======>latestValue");
        System.out.println(resList);
    }

    @Override
    public void calculate(){
        Long res = operator.operate(this.num1, this.num2, this.c);
        resList.add(res);
        if(resList.size() > 3){
            resList.remove(0);
        }
    }

    public void setNum2(long num2) {
        this.num2 = num2;
    }

    public void setNum1(long num1) {
        this.num1 = num1;
    }

    public void setC(char c) {
        this.c = c;
    }
}
