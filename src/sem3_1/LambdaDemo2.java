package sem3_1;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumTask isFactor;
        isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2)) {
            System.out.println("2 является делителем 10 \n");
        }
        if (isFactor.test(10, 3)) {
            System.out.println("3 является делителем 10 \n");
        }

        isFactor = (n, m) -> (n < m);

        if (isFactor.test(2, 10)) {
            System.out.println("2 меньше 10 \n");
        }
        if (isFactor.test(10, 2)) {
            System.out.println("10 меньше 2 \n");
        }

        isFactor = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);

        if (isFactor.test(4,-4)) {
            System.out.println("Абсолютные велечины 4 и -4 равны \n");
        }
        if (isFactor.test(4,-5)) {
            System.out.println("Абсолютные велечины 4 и -5 равны \n");
        }
    }

}
