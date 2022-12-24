package sem4_1;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> twOb = new TwoGen<>(88, "Обобщение");
        twOb.showType();
        int v = twOb.getOb1();
        System.out.println("Значение " + v);
        String str = twOb.ob2;
        System.out.println("Значение " + str);
    }
}
