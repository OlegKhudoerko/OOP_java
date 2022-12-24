package oop_lesson3;

public class Program {
    public static void main(String[] args) {
        Male ivanov = new Male("Иван", "Иванов", 38, 1);
        Female pavlova = new Female("Мария", "Петрова", 25, 2);
        Children_Son ivanovChild = new Children_Son("Игорь", "Иванов", 4,3);
        Children_Daughter ivanovaChild = new Children_Daughter("Алена", "Иванова", 7, 4);

        System.out.println(ivanov);
        System.out.println(pavlova);
        System.out.println(ivanovChild);// Наследование от Male...
        System.out.println(ivanovaChild);// Наследование от Female...
    }
}
