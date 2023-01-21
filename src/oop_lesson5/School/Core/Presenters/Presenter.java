package oop_lesson5.School.Core.Presenters;

 
import oop_lesson5.School.Core.Infrastructure.Generator;
import oop_lesson5.School.Core.Models.Model;
import oop_lesson5.School.Core.Views.View;
import oop_lesson5.School.Mathematics.Exceptions.UnacceptableValueException;
import oop_lesson5.School.Mathematics.Shapes.Circle;
import oop_lesson5.School.Mathematics.Shapes.Rectangle;
import oop_lesson5.School.Mathematics.Shapes.Shape;

public class Presenter {
    Model model;
    View view;

    public Presenter(View view, Model model) {
        this.model = model;
        this.view = view;
    }

    public void append() throws UnacceptableValueException {
        view.set("1 - Circle, 2 - Rectangle");
        String response = view.get();
        Shape figure;

        switch (response) {
            case "1":
                figure = Circle.create(Generator.number(), "Circle_" + Generator.number());
                break;
            default:
                figure = Rectangle.create(
                    Generator.number(),
                    Generator.number(),
                    "Rectangle_" + Generator.number());
                break;
        }

        model.append(figure);
        view.set("ok");

    }

    public void show() {
        view.set(model.show());
    }

    public void showArea()
        {
            view.set(String.format("all Area %s", model.area()));
        }
}
