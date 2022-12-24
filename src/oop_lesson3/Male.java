package oop_lesson3;

public class Male implements Human { //Класс мужчин...
    private String firstname;
    private String lastname;
    private Integer age;
    private Integer idPerson;
    private String eyeColor;
    private String hairColor;

    @Override
    public String speak() {// Голос мужчины
        return "Тенор";
    }


    public Male(String eyeColor, String hairColor) {
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public Male() {
    }

    public Male(int age) {
        this.age = age;
    }

    public Male(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public Male(String firstname, String lastname, int age, int idPerson) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.idPerson = idPerson;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String genders() {
        return "M";
    }

    @Override
    public String toString() {
        return "Имя ='" + firstname + '\'' +
                ", Фамилия = '" + lastname + '\'' +
                ", Возраст = " + age +
                ", Пол = '" + genders() + '\'' +
                ", Персональный номер = " + idPerson +
                ", голос = " + speak() + '}';
    }
}
