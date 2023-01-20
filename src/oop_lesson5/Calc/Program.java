package oop_lesson5.Calc;

import oop_lesson5.Calc.Controller.DivController;
import oop_lesson5.Calc.Controller.MultController;
import oop_lesson5.Calc.Controller.SubController;
import oop_lesson5.Calc.Controller.SumController;
import oop_lesson5.Calc.Model.IntModel.DivModel;
import oop_lesson5.Calc.Model.IntModel.MultModel;
import oop_lesson5.Calc.Model.IntModel.SubModel;
import oop_lesson5.Calc.Model.IntModel.SumModel;
import oop_lesson5.Calc.Presenter.Presenter;
import oop_lesson5.Calc.View.Menu;
import oop_lesson5.Calc.View.View;


import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        View view = new View();
        Presenter p = new Presenter(
                new SumController(view, new SumModel()),
                new SubController(view, new SubModel()),
                new DivController(view, new DivModel()),
                new MultController(view, new MultModel()),
                scanner,
                new Menu(scanner));

        p.start();





    }
}
