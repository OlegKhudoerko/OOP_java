package oop_lesson3;

public class Children_Daughter extends Female {
    public Children_Daughter(String firstname, String lastname, int age, int idPerson) {
        super(firstname, lastname, age, idPerson);
    }

    @Override
    public String speak() {// Голос девочки
        return "Сопрано детский";
    }
}