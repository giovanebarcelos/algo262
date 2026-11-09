package class27;

import java.math.BigDecimal;

public class Math {
    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int subtract(int num1, int num2){
        return num1 - num2;
    }

    public int multiply( int num1, int num2){
        return num1 * num2;
    }

    public BigDecimal divide(BigDecimal num1,
                             BigDecimal num2){
        return num1.divide(num2);
    }
}
