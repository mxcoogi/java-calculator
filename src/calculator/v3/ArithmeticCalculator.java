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

    public ArithmeticCalculator() {
        reslist = new LinkedList<>();
        nums = new ArrayList<>();
        consoleIO = new ConsoleIO();
    }

    public void inputNum() {
        nums.add(consoleIO.inputNum());
    }

    public void inputOP() {
        operator = consoleIO.inputOp();
    }

    @Override
    public void calculate() {
        Number res = operator.operate(nums.get(cnt), nums.get(cnt + 1));
        cnt += 2;
        reslist.add(res);
        if (reslist.size() > 3) {
            reslist.remove(0);

        }
    }

    @Override
    public void getValues() {
        if(!reslist.isEmpty()){
            System.out.println("결과 : " + reslist.get(reslist.size() - 1));
        }
    }

    @Override
    public void getList() {
        System.out.print("결과값 리스트 : ");
        reslist.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();
    }

    public void overResList() {

        Number num1 = nums.get(nums.size() - 1);
        Number num2 = nums.get(nums.size() - 2);
        System.out.print("입력값보다 큰 결과값들 : ");
        reslist.stream()
                .filter(res -> res.doubleValue() > num1.doubleValue() && res.doubleValue() > num2.doubleValue())
                .forEach(res -> System.out.print(res + " "));
        System.out.println();
    }


}
