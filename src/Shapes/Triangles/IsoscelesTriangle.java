package Shapes.Triangles;

public class IsoscelesTriangle extends Triangle{
    String name;
    IsoscelesTriangle() {
        name = "Равнобедренный реугольник";
    }
    @Override
    public String toString() {
        return name;
    }
}
