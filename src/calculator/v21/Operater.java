package calculator.v21;


import java.lang.Long;

public class Operater {


    public Long add(long num1, long num2) {
        long res = num1 + num2;
        if (((num1 ^ res) & (num2 ^ res)) < 0) {
            throw new ArithmeticException("long overflow");
        }
        return res;
    }

    public Long sub(long num1, long num2) {
        long res = num1 - num2;
        if (((num1 ^ num2) & (num1 ^ res)) < 0) {
            throw new ArithmeticException("long overflow");
        }
        return res;
    }

    public Long mul(long num1, long num2) {
        long r = num1 * num2;
        long ax = Math.abs(num1);
        long ay = Math.abs(num2);
        if (((ax | ay) >>> 31 != 0)) {
            if (((num2 != 0) && (r / num2 != num1)) ||
                    (num1 == Long.MIN_VALUE && num2 == -1)) {
                throw new ArithmeticException("long overflow");
            }
        }
        return r;
    }

    public long div(long num1, long num2) {
        // 0으로 나누는 경우 예외 처리
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }

        // Long.MIN_VALUE를 -1로 나누는 경우 예외 처리
        if (num1 == Long.MIN_VALUE && num2 == -1) {
            throw new ArithmeticException("long overflow");
        }

        return num1 / num2;  // 정상적인 나누기 연산
    }


    public Long operate(long num1, long num2, char c) {
        Long res = null;
        try {
            switch (c) {
                case '+':
                    res = add(num1,num2);
                    break;
                case '-':
                    res = sub(num1, num2);
                    break;
                case '*':
                    res = mul(num1, num2);
                    break;
                case '/':
                    res = div(num1, num2);
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return res;
    }
}
