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
        int result = 0;
        while (m>0){//3//2//1//0
            m-=n;
            result++;//1//2//3
        }
        if (m!=0){
            result -= 1;
        }
        return result;
    }
}
