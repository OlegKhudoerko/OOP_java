package oop_lesson6.School.Core.Models;

import oop_lesson6.School.Mathematics.CalculateArea.Calculate;
import oop_lesson6.School.Mathematics.Shapes.Canvas;
import oop_lesson6.School.Mathematics.Shapes.Shape;

public class Model {
    Shape panel;
    Calculate calc;

    public Model(Calculate c, String canvasName) {
        panel = new Canvas(canvasName);//"Без имени (2).jpg");
        calc = c;
    }

    public void append(Shape shape) {
        panel.shapes.add(shape);
    }

    public double area() {
        return calc.visit(panel);
    }

    public String show() {
        return panel.toString();
    }

}
