package oop_lesson5.Calc.View;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public int getValue() {
        System.out.println("Введите число: ");
        int val;
        if (in.hasNextInt()) {
            val = in.nextInt();
        } else {
            System.out.println("Не допустимое значение, попробуйте еще раз: ");
            in.next();
            val = getValue();
        }
        return val;
    }

    public int getValueDiv() {
        System.out.println("Введите следующее число, не равное нулю: ");
        int val;
        if (in.hasNextInt()) {
            val = in.nextInt();
            if (val == 0){
                System.out.println("На ноль делить нельзя, введите следующее число: ");
                val = getValue();
            }
        } else {
            System.out.println("Не допустимое значение, введите следующее число: ");
            in.next();
            val = getValue();
        }
        return val;
    }

    public void print(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }
}
