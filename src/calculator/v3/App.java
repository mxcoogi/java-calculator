package calculator.v3;

import calculator.v3.io.ConsoleIO;

public class App {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

        while(true){
            arithmeticCalculator.inputNum();
            arithmeticCalculator.inputNum();
            arithmeticCalculator.inputOP();
            arithmeticCalculator.calculate();
            arithmeticCalculator.getRes();
        }

    }
}
