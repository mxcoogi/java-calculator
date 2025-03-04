package calculator.v3.io;

import java.util.Scanner;

public class ConsoleIO {

    //속성
    private Scanner sc;

    //생성자
    public ConsoleIO(){
        this.sc= new Scanner(System.in);
    }

    //기능
    public <T extends Number> Number inputNum(){
        String temp = sc.nextLine();
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
}
