package oop_lesson5.Calc.Controller;

import oop_lesson5.Calc.Model.IntModel.MultModel;
import oop_lesson5.Calc.View.View;

public class MultController {
    View view;
    MultModel multModel;

    public MultController(View view, MultModel multModel) {
        this.view = view;
        this.multModel = multModel;
    }

    public void Mult(){
        int a = view.getValue();
        int b = view.getValue();
        multModel.setX(a);
        multModel.setY(b);
        int result = multModel.result();
        view.print(result, "Произведение: ");
    }
}
