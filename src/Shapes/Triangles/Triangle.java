package Shapes.Triangles;

public abstract class Triangle {
    String name;
    Triangle() {
        name = "Треугольник";
    }
    @Override
    public String toString() {
        return name;
    }
}
