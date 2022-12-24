package sem3;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNums myNum;
        myNum = () -> 98.6; // Простое лямбда вырожение ... присвоить значение 98.6
        System.out.println("Постоянное значение " + myNum.GetNum());
        MyParamNums myParam = (n) -> 1.0 / n;

        System.out.println("Обратная велечина 4 =" + myParam.getNums(4.0));
        System.out.println("Обратная велечина 4 =" + myParam.getNums(8.0));
    }


}
