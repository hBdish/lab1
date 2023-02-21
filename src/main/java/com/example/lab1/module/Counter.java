package com.example.lab1.module;

public class Counter {
    private double sum = 0;

    public void setCounter() {

    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double countPr(double sum, int pr){
        return sum * pr / 100;
    }

    public double countSum(double sum, int pr){
        return sum + sum * pr / 100;
    }

    public int countSumTrunc(double sum){
        return (int)sum;
    }
}
