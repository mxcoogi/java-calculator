package calculator.v3;


public class App {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

        while(true){

            System.out.println("계산기를 시작합니다. 종료를 원하시면 exit을 입력해주세요");
            arithmeticCalculator.inputNum();
            arithmeticCalculator.inputNum();
            arithmeticCalculator.inputOP();
            arithmeticCalculator.calculate();
            arithmeticCalculator.getValues();
            arithmeticCalculator.getList();
            arithmeticCalculator.overResList();

        }

    }
}
