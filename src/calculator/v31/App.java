package calculator.v31;

public class App {
    public static void main(String[] args) {

        ArithmeticCalculator calculator = new ArithmeticCalculator();
        while(true){
            System.out.println("제너릭 이용한 계산기 시작 종료하고싶으면 exit 누르기~");
            calculator.inputNum();
            calculator.inputOP();
            calculator.inputNum();
            calculator.calculate();
            calculator.getRes();
            calculator.getList();
        }
    }
}
