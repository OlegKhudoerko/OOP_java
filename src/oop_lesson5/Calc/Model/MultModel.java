package oop_lesson5.Calc.Model;


public class MultModel extends CalcModel {

    public MultModel() {
    }

    @Override
    public int result() {
        return x * y;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }


}
