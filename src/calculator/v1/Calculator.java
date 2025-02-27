package calculator.v1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("=====절차적 계산기=====");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(true){
            if(flag){
                try{
                    System.out.print("정수를 입력 해주세요 : ");
                    int val1 = Integer.parseInt(sc.nextLine());
                    System.out.println("입력값 : " + val1);
                    flag =!flag;
                } catch (Exception e) {
                    System.out.println("잘못된 값입니다. 다시 입력해주세요");
                }
            }else{
                try{
                    System.out.println("+  -  *  /  =");
                    System.out.print("연산자를 입력 해주세요 : ");
                    char operator = sc.nextLine().charAt(0);
                    System.out.println("입력값 : " + operator);
                    flag = !flag;
                } catch (Exception e) {
                    System.out.println("잘못된 값입니다. 다시 입력해주세요");
                }
            }

        }
    }
}
