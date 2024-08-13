package Shapes.Quadrilateral;

public abstract class Quadrilateral {
    String name;
    Quadrilateral() {
        name = "Четырехугольник";
    }
    @Override
    public String toString() {
        return name;
    }
}
