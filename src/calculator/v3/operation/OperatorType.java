package calculator.v3.operation;

import java.util.function.BinaryOperator;

public enum OperatorType {
    ADD('+', (a,b)-> a+b),
    SUB('-', (a,b)-> a-b),
    MUL('*', (a,b)-> a*b),
    DIV('/', (a,b)-> a/b);

    private char symbol;
    BinaryOperator<Double> operation;

    OperatorType(char symbol, BinaryOperator<Double> operation){
        this.symbol = symbol;
        this.operation = operation;
    }


    public <S extends Number> Number operate(S a, S b){
        Double res = operation.apply(a.doubleValue(), b.doubleValue());
        if(res == res.longValue()){
            return res.longValue();
        }
        return res;
    }
}
