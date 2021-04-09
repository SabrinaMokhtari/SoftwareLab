package com.company.EXP3.Bridge;

public class RecursivePower extends Power {

    public RecursivePower(Multiplication multiplication){
        super(multiplication);
    }

    @Override
    public int operation(int base, int exp) {
        return 0;
    }
}
