package calculator;

import calculator.CalculatorIF;

public class CalculatorPrototype implements CalculatorIF {

    @Override
    public int sum (int m, int n){
        int result = m;
        for (int i=0; i<n; i++){
            result++;
        }
        return result;
    }

    @Override
    public int divide (int m, int n){
        int result = m;
        while (m>0){
            m-=n;
            result++;
        }
        if (m!=0){
            result -= 1;
        }
        return result;
    }
}
