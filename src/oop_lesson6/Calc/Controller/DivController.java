package oop_lesson6.Calc.Controller;

import oop_lesson6.Calc.Model.IntModel.DivModel;
import oop_lesson6.Calc.View.View;

public class DivController {
    View view;
    DivModel divModel;

    public DivController(View view, DivModel divModel) {
        this.view = view;
        this.divModel = divModel;
    }

    public void Div() {
        int a = view.getValue();
        int b = view.getValueDiv();
        divModel.setX(a);
        divModel.setY(b);
        int result = divModel.result();
        view.print(result, "Частное: "); //вывод msg(...)
    }
}
