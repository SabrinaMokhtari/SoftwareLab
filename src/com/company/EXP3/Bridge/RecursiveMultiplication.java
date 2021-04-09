package com.company.EXP3.Bridge;

public class RecursiveMultiplication implements Multiplication {
    @Override
    public int mul(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else if (b < 0) {
            return -a + mul(a, b + 1);
        } else {
            return a + mul(a, b - 1);
        }
    }
}