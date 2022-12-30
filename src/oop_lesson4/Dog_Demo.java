package oop_lesson4;

public class Dog_Demo {
    public static void main(String[] args) {
        LiveEarth<Integer, String> dog1 = new LiveEarth<>(6, "Веста");

        System.out.println("Моей первое собаке " + dog1.getOb1() + " лет, её зовут " + dog1.ob2);


        LiveEarth<Integer, String> dog2 = new LiveEarth<>(4, "Айра");

        System.out.println("Моей второй собаке " + dog2.getOb1() + " лет, её зовут " + dog2.ob2);
    }
}

