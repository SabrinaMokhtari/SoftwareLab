package com.company.EXP3.Bridge;

public class WhilePower extends Power {

    public WhilePower(Multiplication multiplication){
        super(multiplication);
    }

    @Override
    public int operation(int base, int exp) {
        return 0;
    }
}
