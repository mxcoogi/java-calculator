package calculator.v31;

import calculator.v2.Calculator;
import calculator.v3.operation.OperatorType;
import calculator.v31.io.ConsoleIO;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ArithmeticCalculator implements Calculator {
    private Queue<Box> resList;
    private ConsoleIO consoleIO;
    private OperatorType operatorType;
    private List<Box> numList;


    ArithmeticCalculator(){
        resList = new LinkedList<>();
        consoleIO = new ConsoleIO();
        numList = new LinkedList<>();
    }

    @Override
    public void getRes() {
        System.out.println(resList.peek());
    }

    @Override
    public void getList() {
        resList.stream().map(s -> s.getValue()).forEach(s -> System.out.print(s + " "));
    }

    @Override
    public void calculate() {

    }

    public void inputOP() {
        operatorType = consoleIO.inputOp();
    }
    public void inputNum(){
        numList.add(consoleIO.inputNum());
    }
}
