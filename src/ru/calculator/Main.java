package ru.calculator;
import java.util.Scanner;
import ru.calculator.Calculator;
public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Введите числа");
        double firstDigit = scan.nextDouble();
        double secondDigit = scan.nextDouble();
        System.out.println("Выберете арифметическое действие: \n +   -   *   / ");
        String action = scan.next();
        switch (action) {
            case  "+":
                calc.add(firstDigit, secondDigit);
                break;
            case  "-" :
                calc.sub(firstDigit, secondDigit);
                break;

            case "*":
                calc.mul(firstDigit, secondDigit);
                break;
            case "/":
                calc.div(firstDigit, secondDigit);
                break;
        }

    }

}