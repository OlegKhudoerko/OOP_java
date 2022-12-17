package oop_lesson1;

public class Male extends Human {
    public Male(String firstName, String lastName, Integer idPerson) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.idPerson = idPerson;
    }
    @Override
    public String apper() {
        return "Он ";
    }
}
