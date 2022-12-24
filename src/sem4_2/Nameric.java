package sem4_2;

public class Nameric <T extends Number>{
    T num;

    public Nameric(T n) {
        num = n;
    }
    double recNum(){
        return 1/num.doubleValue();
    }
    double fract(){
        return num.doubleValue() - num.intValue();
    }
    boolean absEqua(Nameric<?> ob) {//шаблон
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) {
            return  true;
        }
        return false;
    }


}
