package calculator.v3;
import calculator.v2.Calculator;
import calculator.v3.io.ConsoleIO;
import calculator.v3.operation.OperatorType;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArithmeticCalculator implements Calculator {
    private List<Number> reslist;
    private OperatorType operator;
    private List<Number> nums;
    private ConsoleIO consoleIO;
    private static int cnt = 0;

    public ArithmeticCalculator(){
        reslist = new LinkedList<>();
        nums = new ArrayList<Number>();
        consoleIO = new ConsoleIO();
    }

    public void inputNum(){
        nums.add(consoleIO.inputNum());
    }

    public void inputOP(){
        operator = consoleIO.inputOp();
    }

    @Override
    public void calculate(){
        Number res = operator.operate(nums.get(cnt), nums.get(cnt+1));
        cnt+=2;
        reslist.add(res);
        System.out.println(res);
        if(reslist.size() > 3){
            reslist.remove(0);

        }
    }

    @Override
    public void getValues() {

    }

    @Override
    public void getList(){
        reslist.stream().forEach(s -> System.out.print(s+" "));
        System.out.println();
    }


}
