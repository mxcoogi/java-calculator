package calculator.v2;

import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);
    String temp;
    public String input(){
        temp = sc.nextLine();
        if(temp.equals("exit")){
            System.out.println("프로그램을 종료합니다.");
            System.exit(-1);
        }
        return temp;
    }

}
