package calculator.v3;

import calculator.v3.io.ConsoleIO;
import calculator.v3.operation.OperatorType;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArithmeticCalculator{
    private List<Number> list;
    private OperatorType operator;
    private List<Number> Nums;
    private ConsoleIO consoleIO;

    public ArithmeticCalculator(){
        list = new LinkedList<>();
        Nums = new ArrayList<Number>();
        consoleIO = new ConsoleIO();
    }

    public void inputNum(){
        Nums.add(consoleIO.inputNum());
    }

    public void inputOP(){
        operator = consoleIO.inputOp();
    }








}
