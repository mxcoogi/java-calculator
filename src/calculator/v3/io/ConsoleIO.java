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
        }
        return null;
    }

    public OperatorType inputOp(){
        String temp = sc.nextLine();
        checkExit(temp);
        return switch (temp) {
            case "+" -> OperatorType.ADD;
            case "-" -> OperatorType.SUB;
            case "*" -> OperatorType.MUL;
            case "/" -> OperatorType.DIV;
            default -> null;
        };
    }

    public void checkExit(String s){
        if(s.equals("exit")) System.exit(-1);
    }
}