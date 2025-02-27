package calculator.v1;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("=====절차적 계산기=====");
        System.out.println("프로그램 종료하고 싶으면 exit을 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int val1=0; int val2 = 0; int res;
        String input;
        while(true){

            //두 정수 입력 받기
            while(true){
                try{
                    System.out.print("첫 번째 수를 입력 해주세요 : ");
                    input = sc.nextLine();
                    if(input.equals("exit")) return;
                    val1 = Integer.parseInt(input);
                    if(val1 < 0){
                        System.out.println("0 이상의 정수만 입력 해주세요");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("0 이상의 정수만 입력 해주세요");
                }
            }
            while(true){
                try{
                    System.out.print("두 번째 수를 입력 해주세요 : ");
                    input = sc.nextLine();
                    if(input.equals("exit")) return;
                    val2 = Integer.parseInt(input);
                    if(val2 < 0){
                        System.out.println("0 이상의 정수만 입력 해주세요");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("0 이상의 정수만 입력 해주세요");
                }
            }
            //연산자 입력받기
            while(true){
                try{
                    System.out.println("+  -  *  /");
                    System.out.print("연산자를 입력 해주세요 :");
                    input = sc.nextLine();
                    if(input.equals("exit")) return;
                    if(input.length() > 1){
                        continue;
                    }
                    char operator = input.charAt(0);
                    switch (operator){
                        case '+':
                            res = val1 + val2;
                            System.out.println(res + " = "+val1+" + "+val2);
                            break;
                        case '-':
                            res = val1 - val2;
                            System.out.println(res+ " = "+val1+" - "+val2);
                            break;
                        case '*':
                            res = val1 * val2;
                            System.out.println(res + " = "+val1+" * "+val2);
                            break;
                        case '/':
                            res = val1 / val2;
                            System.out.println(res + " = "+val1+" / "+val2);
                            break;
                        default:
                            System.out.println("올바른 연산자를 입력 해주세요");
                            continue;
                    }


                } catch (Exception e) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }break;
            }


        }

    }
}
