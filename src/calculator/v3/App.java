package calculator.v3;

import calculator.v3.io.ConsoleIO;

public class App {
    public static void main(String[] args) {
        ConsoleIO consoleIO = new ConsoleIO();
        while(true){
            Number s = consoleIO.inputNum();
            System.out.println(s.getClass() + " " + s);
        }

    }
}
