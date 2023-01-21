package oop_lesson6.Calc.View;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public String selectFunction() {// Ввывод через msg, с учетом языка...
        System.out.print("""
                --------------------------------------
                Выберите действие:
                --------------------------------------
                1. сложение
                2. вычитание
                3. деление
                4. умножение
                5. операции с комплексными числами
                --------------------------------------
                0. Выход
                """);
        return scanner.nextLine();
    }

}
