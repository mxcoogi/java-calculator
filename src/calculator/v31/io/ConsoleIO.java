package calculator.v31.io;

import calculator.v3.operation.OperatorType;
import calculator.v31.Box;

import java.util.Scanner;

public class ConsoleIO{

    private Scanner sc;

    public ConsoleIO(){
        sc = new Scanner(System.in);
    }

    public void checkExit(String s){
        if(s.equals("exit")) {
            sc.close();
            System.exit(-1);
        }
    }

    public Box inputNum(){
        while(true){
            System.out.print("정수를 입력 해주세요 : ");
            String temp = sc.nextLine();
            checkExit(temp);
            try{
                if(temp.contains(".")){
                    return new Box<>(Double.parseDouble(temp));
                }else{
                    return new Box<>(Long.parseLong(temp));
                }
            }catch (NumberFormatException e){
                System.out.println("올바른 정수를 입력해주세요");
            }
        }
    }

    public OperatorType inputOp(){
        while(true){
            System.out.print("+ - * / 중 연산자를 입력해주세요:");
            String temp = sc.nextLine();
            checkExit(temp);
            switch (temp) {
                case "+":
                    return OperatorType.ADD;
                case "-":
                    return OperatorType.SUB;
                case "*":
                    return OperatorType.MUL;
                case "/":
                    return OperatorType.DIV;
                default:
                    System.out.println("올바른 연산자를 입력해주세요");
            }
        }
    }

}
