package oop_lesson4;

public class LiveEarth <T, V> {
    T ob1;
    V ob2;

    LiveEarth(T o1, V o2) {
    ob1 = o1;
    ob2 = o2;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }
    void showType(){
        System.out.println("Тип Т это: " + ob1.getClass().getName());
        System.out.println("Тип V это: " + ob2.getClass().getName());
    }
}
