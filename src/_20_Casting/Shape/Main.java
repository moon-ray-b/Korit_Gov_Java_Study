package _20_Casting.Shape;

public class Main {
    public static void main(String[] args) {
        Shape sh1 = new Circle(5);
        sh1.render();

        Shape sh2 = new Rectangle(5, 4);
        sh2.render();

        Shape sh3 = new Triangle(5, 4);
        sh3.render();

        double total = 0;
        Shape[] shapes = {sh1, sh2, sh3};
        for( Shape shape : shapes ){
            total += shape.area();
        }
        System.out.println(total);
    }
}
