package _20_Casting.Shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.render();
        circle.area();
        Rectangle rectangle = new Rectangle(5, 4);
        rectangle.render();
        rectangle.area();
        Triangle triangle = new Triangle(5,4);
        triangle.render();
        triangle.area();
    }
}
