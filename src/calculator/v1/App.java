package calculator.v1;

import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        System.out.println("=====절차적프로그래밍=====");
        Scanner sc = new Scanner(System.in);
        Set<Character> operators = Set.of('+', '-', '*', '/');
        int num1;
        int num2;
        char operator;
        int res = 0;
        String temp;

        while (true) {

            while (true) {
                System.out.print("첫 번째 수를 입력 해주세요: ");
                temp = sc.nextLine();
                try {
                    num1 = Integer.parseInt(temp);
                    if (num1 < 0) {
                        System.out.println("0이상의 수를 입력 해 주세요");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("0 이상의 정수 입력해주세요");
                }
            }
            while (true) {
                System.out.print("두 번째 수를 입력 해주세요: ");
                temp = sc.nextLine();
                try {
                    num2 = Integer.parseInt(temp);
                    if (num2 < 0) {
                        System.out.println("0이상의 수를 입력 해 주세요");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("0 이상의 정수 입력해주세요");
                }
            }
            while (true) {
                System.out.print("연산자를 입력 해주세요 ( + - * / ) : ");
                temp = sc.nextLine();
                try {
                    if (temp.length() == 1 && operators.contains(temp.charAt(0))) { //유빈님 코드 참고
                        operator = temp.charAt(0);
                        break;
                    } else {
                        System.out.println("올바른 연산자를 입력해 주세요");
                    }
                } catch (Exception e) {
                    System.out.println("올바른 연산자를 입력해 주세요");
                }
            }
            //연산부분
            try {
                switch (operator) {
                    case '+':
                        res = num1 + num2;
                        break;
                    case '-':
                        res = num1 - num2;
                        break;
                    case '*':
                        res = num1 * num2;
                        break;
                    case '/':
                        res = num1 / num2;
                        break;
                }
            } catch (RuntimeException e) {
                System.out.println(e);
                break;
            }
            System.out.println(res);
            System.out.print("종료 원하시면 exit 입력: ");
            temp = sc.nextLine();
            if (temp.equals("exit")) break;
        }
    }
}
