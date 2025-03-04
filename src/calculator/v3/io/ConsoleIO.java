package calculator.v3.io;
import calculator.v3.operation.OperatorType;
import java.util.Scanner;

public class ConsoleIO {

    //속성
    private Scanner sc;

    //생성자
    public ConsoleIO(){
        this.sc= new Scanner(System.in);
    }

    //기능
    public Number inputNum(){
        while(true){
            System.out.print("정수를 입력 해주세요 : ");
            String temp = sc.nextLine();
            checkExit(temp);
            try{
                if(temp.contains(".")){
                    return Double.parseDouble(temp);
                }else{
                    return Integer.parseInt(temp);
                }
            }catch (Exception e){
                System.out.println(e);
                System.out.println("다시 입력해 주세요");
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

    public void checkExit(String s){
        if(s.equals("exit")) System.exit(-1);
    }
}