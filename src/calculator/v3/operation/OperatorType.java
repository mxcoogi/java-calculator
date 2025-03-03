package calculator.v3.operation;

public enum OperatorType {
    ADD('+'), SUB('-'), MUL('*'), DIV('/');
    private char symbol;
    OperatorType(char symbol){
        this.symbol = symbol;
    }
}
