package oop_lesson1;

public class Human {
    String firstname;
    String lastname;
    int age;
    String country;
    String gender;
    Integer parent;
    Integer idPerson;

    public Human() {
        this.firstname = "";
        this.lastname = "";
        this.age = 0;
        this.country = "";
        this.gender = "";
        this.parent = null;
        this.idPerson = null;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }
        public Human(String firstname, String lastname, Integer idPerson) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.idPerson = idPerson;
    }
    public void greetings(String msg) {
        System.out.println(msg);
    }

    public void printInfo(){
        System.out.println(printString());
    }

    public String apper() {
        return "Он";
    }

     public String printString() {
        return apper() + "GeoTree{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                ", parent=" + parent +
                ", idPerson=" + idPerson +
                '}';
    }
}
