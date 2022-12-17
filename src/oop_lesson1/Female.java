package oop_lesson1;

public class Female extends Human {
    public Female(String firstName, String lastName, Integer idPerson) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.idPerson = idPerson;
    }
    @Override
    public String apper() {
        return "Она ";
    }
}
