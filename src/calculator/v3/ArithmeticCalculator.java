package calculator.v3;

import calculator.v3.io.ConsoleIO;
import calculator.v3.operation.OperatorType;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArithmeticCalculator{
    private List<Number> reslist;
    private OperatorType operator;
    private List<Number> Nums;
    private ConsoleIO consoleIO;

    public ArithmeticCalculator(){
        reslist = new LinkedList<>();
        Nums = new ArrayList<Number>();
        consoleIO = new ConsoleIO();
    }

    public void inputNum(){
        Nums.add(consoleIO.inputNum());
    }

    public void inputOP(){
        operator = consoleIO.inputOp();
    }

    public void calculate(){
        Number res = operator.operate(Nums.get(0), Nums.get(1));
        reslist.add(res);
    }

    public void getRes(){
        System.out.println(Nums + " " + operator);
        System.out.println(reslist);
    }






}
