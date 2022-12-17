package oop_lesson1;

public class Main {
    public static void main(String[] args) {
        Male ivanov = new Male("Иван", "Иванов", 1);
        ivanov.printInfo();
        Female petrova = new Female("Мария", "Петрова", 2);
        petrova.printInfo();
    }
}
