package calculator.v2;

public class Operator {

    public Integer excute(int num1, int num2, char c){
        int res;
        switch (c){
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case  '/':
                res = num1 / num2;
                break;
            default:
                return null;
        }
        return res;
    }

}
