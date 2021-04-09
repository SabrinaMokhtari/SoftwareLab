package com.company.EXP3.Bridge;

public abstract class Power {
    protected Multiplication multiplication;
    Power(Multiplication multiplication){
        this.multiplication = multiplication;
    }
    public int operation(int base, int exp){
        return 0;
    }
}
