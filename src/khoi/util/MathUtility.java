/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khoi.util;

/**
 *
 * @author Nguyen Khoi
 */
public class MathUtility {
    //jdk co class java.util.math , co 1 loay hàm static

    public static final double PI = 3.1415;
    //ham tinh n! = 1*2*3*4*5*...

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("N must be between 1 - 20 !!!");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
