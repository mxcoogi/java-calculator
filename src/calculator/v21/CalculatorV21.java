package calculator.v21;
import java.util.LinkedList;
import java.util.List;

public class CalculatorV21 implements Calculator{

    private List<Long> resList = new LinkedList<>();
    private Operator operator = new Operator();
    private long num1;
    private long num2;
    private char c;

    @Override
    public Long getValues() {
        return null;
    }

    @Override
    public List<Long> getList() {
        return this.resList;
    }

    public Long operate(){
        Long res = operator.operate(this.num1, this.num2, this.c);
        resList.add(res);
        return res;
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
