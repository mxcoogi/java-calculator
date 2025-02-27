package calculator.v2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class CalculatorV2 implements Calculator{

    private List<Integer> res;
    private Operator operator;
    private int num1;
    private int num2;
    private char operation;
    private int ptr = -1;
    public CalculatorV2(){
        this.res = new LinkedList<>();
        this.operator = new Operator();
    }

    public boolean operate(){
        try{
            int value = this.operator.excute(this.num1,this.num2,this.operation);
            res.add(value);
            ptr++;
            return true;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다. 처음부터 다시 입력 해 주세요.");
            return false;
        }
    }

    @Override
    public int valueReturn() {
        return res.get(ptr);
    }

    public boolean setNum1(String val) {
        try{
            int num = Integer.parseInt(val);
            if(num < 0){
                System.out.println("0 이상의 정수를 입력 해 주세요");
                return false;
            }
            this.num1 = num;
        }catch (Exception e){
            System.out.println(e + "0 이상의 정수를 입력 해 주세요");
            return false;
        }
        return true;
    }

    public boolean setNum2(String val) {
        try{
            int num = Integer.parseInt(val);
            if(num < 0){
                System.out.println("0 이상의 정수를 입력 해 주세요");
                return false;
            }
            this.num2 = num;
        }catch (Exception e){
            System.out.println(e + "0 이상의 정수를 입력 해 주세요");
            return false;
        }
        return true;
    }

    public boolean setOperation(String operation) {
        if(operation.length() > 1){
            System.out.println("올바른 연산자를 입력 해 주세요");
            return false;
        }
        this.operation = operation.charAt(0);

        return true;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public char getOperation() {
        return operation;
    }

    @Override
    public List<Integer> getRes() {
        return res;
    }
}
