package sem4_1;

public class TwoGen <T, V> {
    T ob1;
    V ob2;

    public TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    void showType(){
        System.out.println("Тип Т это: " + ob1.getClass().getName());
        System.out.println("Тип V это: " + ob2.getClass().getName());
    }
    T getOb1(){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }
}
