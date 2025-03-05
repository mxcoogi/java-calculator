package calculator.v31.operation;

@FunctionalInterface
public interface Operate{

    //두 수를 받고 실수형을 리턴해주는 연산함수 구현
    double operate(double a, double b);
}
