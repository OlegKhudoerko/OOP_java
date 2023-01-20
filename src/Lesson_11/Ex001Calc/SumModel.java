//package Lesson_11.Ex001Calc;
//
//import java.util.Scanner;
//
//public class SumModel extends Ex001Calc.CalcModel {
//
//    public SumModel() {
//
//    }
//    // do_it
//    @Override
//    public int result() {
//        return x + y;
//    }
//
//    @Override
//    public void setX(int value) {
//        super.x = value;
//    }
//
//    @Override
//    public void setY(int value) {
//        super.y = value;
//    }
//
//    public static class View {
//        Scanner in = new Scanner(System.in);
//
//        public int getValue(String title) {
//            System.out.printf("%s", title);
//            return in.nextInt();
//        }
//
//        // print(f'{title} = {data}')
//        public void print(int data, String title) {
//            System.out.printf("%s %d\n", title, data);
//        }
//    }
//}
