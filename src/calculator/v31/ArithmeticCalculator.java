package calculator.v31;

import calculator.v2.Calculator;
import calculator.v3.operation.OperatorType;
import calculator.v31.io.ConsoleIO;

import java.util.LinkedList;
import java.util.Queue;

public class ArithmeticCalculator implements Calculator {
    private Queue<Box> resList;
    private ConsoleIO consoleIO;
    private OperatorType operatorType;


    ArithmeticCalculator(){
        resList = new LinkedList<>();
        consoleIO = new ConsoleIO();
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
}
