package com.example.sobrecargametodos;

public class Calculator {
    int num1;
    int num2;
    int sum;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void add (int num1, int num2) {
        sum = num1 + num2;
    }

    public void add (int num1, int num2, int num3) {
        sum = num1 + num2 + num3;
    }

    public void add (float num1, float num2) {
        sum = (int) (num1 + num2);
    }

    public void add (double num1, double num2) {
        sum = (int) (num1 + num2);
    }
}
