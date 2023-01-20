package oop_lesson5.Calc.Controller;

import oop_lesson5.Calc.Model.SumModel;
import oop_lesson5.Calc.View.View;

public class SumController {
    View view;
    SumModel model;

    public SumController(View view, SumModel model) {
        this.view = view;
        this.model = model;
    }

    public void Sum() {
        int a = view.getValue();
        int b = view.getValue();
        model.setX(a);
        model.setY(b);
        int result = model.result();
        view.print(result, "Сумма: ");
    }
}
