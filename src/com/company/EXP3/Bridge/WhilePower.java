package com.company.EXP3.Bridge;

public class WhilePower extends Power {

    public WhilePower(Multiplication multiplication){
        super(multiplication);
    }

    @Override
    public int operation(int base, int exp) {
        int ans = 1;
        while (exp > 0){
            ans = multiplication.mul(ans, base);
            exp -= 1;
        }
        return ans;
    }
}
