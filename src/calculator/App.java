package calculator;

import calculator.v2.CalculatorV2;
import calculator.v2.Input;
import calculator.v1.CalculatorV1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("==1. 절차지향 계산기  2. 객체지향 계산기==");
        System.out.print("선택하세요 : ");
        Input input = new Input();
        String select = input.input();
        if(select.equals("1")){
            CalculatorV1.main(args);
        }else if(select.equals("2")){
            CalculatorV2 calculatorV2 = new CalculatorV2();
            String temp;
            while(true){
                System.out.println("=====객체지향 계산기=====");
                System.out.println("프로그램 종료하고 싶으면 exit을 입력해주세요");
                while(true){
                    System.out.print("첫번째 정수를 입력 해 주세요: ");
                    temp= input.input();
                    if(calculatorV2.setNum1(temp)){
                        break;
                    }
                }
                while(true){
                    System.out.print("두번째 정수를 입력 해 주세요: ");
                    temp= input.input();
                    if(calculatorV2.setNum2(temp)){
                        break;
                    }
                }
                while(true){
                    System.out.print("연산자를 입력 해 주세요: ");
                    temp = input.input();
                    if(calculatorV2.setOperation(temp)){
                        break;
                    }
                }
                if(!calculatorV2.operate()) continue;

                System.out.println(calculatorV2.getNum1() +" "+ calculatorV2.getOperation() +" "+ calculatorV2.getNum2()+" = "+ calculatorV2.valueReturn());
                System.out.println(calculatorV2.getRes());
            }
        }else{
            System.out.println("업데이트 예정");
        }

    }
}
