package calculator.v21;

import java.util.Scanner;
import java.util.Set;

public class InputParser {
    private Scanner sc;
    private String temp;
    private Set<Character> operators;

    public InputParser(){
        sc = new Scanner(System.in);
        operators = Set.of('+', '-', '*', '/');
    }

    public Long inputNum() {
        while (true) {
            try{
                System.out.print("정수를 입력 해 주세요: ");
                temp = sc.nextLine();
                if(temp.equals("exit")) System.exit(-1);
                Long value = Long.parseLong(temp);
                if(value < 0){
                    System.out.println("0이상의 정수만 입력 해 주세요");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("올바른 정수를 입력 해 주세요");
            }
        }
    }

    public char inputChar(){
        while(true){
            System.out.print("연산자를 입력해 주세요: ");
            temp = sc.nextLine();
            if(temp.equals("exit")) System.exit(-1);
            if(temp.length() > 1 || !operators.contains(temp.charAt(0))){
                System.out.println("올바른 연산자를 입력 해 주세요");
                continue;
            }
            return temp.charAt(0);
        }
    }

}
