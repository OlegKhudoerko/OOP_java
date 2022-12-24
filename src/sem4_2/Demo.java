package sem4_2;

public class Demo {
    public static void main(String[] args) {
        Nameric<Integer> intOb = new Nameric<>(6);
        Nameric<Double> dOb = new Nameric<>(-6.0);
        Nameric<Long> lOb = new Nameric<>(5L);
        System.out.println("Сравнение intOb и dOb: ");
        if (intOb.absEqua(dOb)) {
            System.out.println("Абсолютные значения совпадают ");
        } else {
            System.out.println("Абсолютные значения не совпадают ");
        }

        System.out.println("Сравнение intOb и lOb: ");
        if (intOb.absEqua(lOb)) {
            System.out.println("Абсолютные значения совпадают ");
        } else {
            System.out.println("Абсолютные значения не совпадают ");
        }

//        System.out.println("Обратная величина intOb:  " + intOb.recNum());
//        System.out.println("Дробная часть intOb: " + intOb.fract());
//        System.out.println();
//
//        Nameric <Double> dOb = new Nameric<>(5.25);
//        System.out.println("Обратная величина dOb:  " + dOb.recNum());
//        System.out.println("Дробная часть dOb: " + dOb.fract());
//        System.out.println();
    }
}
