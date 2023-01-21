package oop_lesson6.Calc.Controller;

import oop_lesson6.Calc.Model.IntModel.SubModel;
import oop_lesson6.Calc.View.View;

public class SubController {
    View view;
    SubModel subModel;

    public SubController(View view, SubModel subModel) {
        this.view = view;
        this.subModel = subModel;
    }
    public void Sub(){
        int a = view.getValue();
        int b = view.getValue();
        subModel.setX(a);
        subModel.setY(b);
        int result = subModel.result();
        view.print(result, "Разность: "); //вывод msg(...)
    }
}
