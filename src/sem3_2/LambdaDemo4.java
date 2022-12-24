package sem3_2;

import java.util.function.BinaryOperator;

//interface BinaryOperator< T > {
//    T apply ( T n, T, m);
//}

public class LambdaDemo4 {
    public static void main(String[] args) {
        BinaryOperator<Integer> val = (x, y) -> x * y;
        System.out.println(val.apply(3, 5));
        System.out.println(val.apply(2, 8));

    }
}
