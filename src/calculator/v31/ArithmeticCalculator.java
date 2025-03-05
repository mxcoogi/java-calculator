package calculator.v31;

import calculator.v2.Calculator;
import calculator.v3.operation.OperatorType;
import calculator.v31.io.ConsoleIO;

import java.util.*;

public class ArithmeticCalculator implements Calculator {
    private List<Box> resList;
    private ConsoleIO consoleIO;
    private OperatorType operatorType;
    private List<Box> numList;


    ArithmeticCalculator(){
        resList = new ArrayList<>();
        numList = new ArrayList<>();
        consoleIO = new ConsoleIO();

    }

    @Override
    public void getRes() {
        System.out.print("결과값 : ");
        System.out.println(resList.get(resList.size()-1).getValue());
    }

    @Override
    public void getList() {
        System.out.print("결과 리스트 : ");
        resList.stream().map(s -> s.getValue()).forEach(s -> System.out.print(s + " "));
        System.out.println();
    }

    @Override
    public void calculate() { // 고정된 인덱스로 해서 계속 같은 값 넣는거 확인
        Box<? extends Number> res = new Box<>(operatorType.operate(numList.get(0).getValue(), numList.get(1).getValue()));
        numList.clear(); //리스트 초기화
        resList.add(res);
        if(resList.size() > 3){
            resList.remove(0);
        }
    }

    public void inputOP() {
        operatorType = consoleIO.inputOp();
    }
    public void inputNum(){
        numList.add(consoleIO.inputNum());
    }
}
