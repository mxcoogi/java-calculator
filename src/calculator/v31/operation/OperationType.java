package calculator.v31.operation;

public enum OperationType {

    ADD("+" ,(a,b) -> a+b),
    SUB("-", (a, b)->a-b),
    MUL("*", (a,b)->a*b),
    DIV("/", (a,b)->a/b)
    ;
    private String symbol;
    Operate operateFunction;

    private OperationType(String symbol, Operate op){
        this.symbol= symbol;
        this.operateFunction = op;
    }

    public <S extends Number> double operate(S a, S b){
        return operateFunction.operate(a.doubleValue(), b.doubleValue());
    }




}
