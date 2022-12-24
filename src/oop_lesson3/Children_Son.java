package oop_lesson3;

public class Children_Son extends Male {

    public Children_Son(String firstname, String lastname, int age, int idPerson) {
        super(firstname, lastname, age, idPerson);
    }

    @Override
    public String speak() {// Голос мальчика
        return "Альт";
    }
}
