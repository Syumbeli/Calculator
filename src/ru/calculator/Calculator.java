package ru.calculator;

public class Calculator{
    public double add(double first, double second){
        double add = first + second;
        System.out.println(add);
        return add;
    }
    public double sub(double first, double second){
        double sub = first - second;
        System.out.println(sub);
        return sub;
    }
    public double mul(double first, double second){
        double mul = first * second;
        System.out.println(mul);
        return mul;
    }
    public double div(double first, double second) throws ArithmeticException{
        if (first == 0 || second == 0){
            throw new ArithmeticException("Делить на ноль нельзя!");
        }
        double div = first/second;
        System.out.println(div);
        return div;
    }
}