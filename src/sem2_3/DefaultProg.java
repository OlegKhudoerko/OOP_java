package sem2_3;

public class DefaultProg {
    public static void main(String[] args) {
        MyYorykClass obj = new MyYorykClass();

        int uId =Yoryk.getUniversalId();
        System.out.println("Уневерсальный Id " + uId);

        System.out.println("Id пользователя " + obj.getUserId());
        System.out.println("Id Админа " + obj.getAminId());
    }
}
