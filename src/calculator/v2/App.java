package calculator.v2;

import calculator.v2.io.InputParser;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("=====객체지향 프로그래밍=====");
        System.out.println("=======exit 종료버튼=======");
        Scanner sc = new Scanner(System.in);
        //계산시작
        CalculatorV21 cal = new CalculatorV21();
        InputParser parser = new InputParser();
        while (true) {

            //첫 수 입력
            cal.setNum1(parser.inputNum());
            //두 수 입력
            cal.setNum2(parser.inputNum());
            //연산자 입력
            cal.setC(parser.inputChar());
            //연산부분
            cal.calculate();
            //결과 출력 및 반복유무
            cal.getRes();
            cal.getList();

        }
    }
}
