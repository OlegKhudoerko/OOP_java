package oop_lesson4;


public class Cat_Demo {
    public static void main(String[] args) {
        LiveEarth<Integer, String> cat = new LiveEarth<>(5, "Говард");

        System.out.println("Коту " + cat.getOb1() + " лет, его зовут " + cat.ob2);

    }

}
