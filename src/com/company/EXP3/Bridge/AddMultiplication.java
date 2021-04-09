package com.company.EXP3.Bridge;

public class AddMultiplication implements Multiplication {
    @Override
    public int mul(int a, int b) {
        int ans = 0;
        for (int i=0 ; i < b ; i++){
            ans += a;
        }
        return ans;
    }
}
