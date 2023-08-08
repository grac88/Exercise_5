package com.max.idea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char operator;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите 2 числа: \n");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nВведите символ (+, -, *, /): ");
        operator = reader.next().charAt(0);
        switch(operator) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default:  System.out.print("Ошибка! Введите корректный символ");
                return;
        }
        System.out.print("\nРезультат:\n");
        System.out.print(num1 + " " + operator + " " + num2 + " = " + ans);
    }
}
