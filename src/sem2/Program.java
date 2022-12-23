package sem2;

public class Program {
    public static void main(String[] args) {
        RealNums obj = new RealNums();
        RealNums2 obj2 = new RealNums2();
        Nums obi; //ССылка на интерфейс

        for (int i = 0; i < 5; i++) {
            obi = obj;
            System.out.println("Следующее значение " + obi.getNext());
        }
        for (int i = 0; i < 5; i++) {
            obi = obj2;
            System.out.println("Следующее значение " + obi.getNext());
        }

        obj.printMsg();

    }
}
