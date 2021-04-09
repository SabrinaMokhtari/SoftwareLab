package com.company.EXP3.Bridge;

public class RecursivePower extends Power {

    public RecursivePower(Multiplication multiplication){
        super(multiplication);
    }

    @Override
    public int operation(int base, int exp) {
        if (exp == 0)
            return 1;
        else
            return multiplication.mul(base , this.operation(base, exp-1));
    }
}