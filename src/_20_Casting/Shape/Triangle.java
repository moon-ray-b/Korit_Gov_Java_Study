package _20_Casting.Shape;
/*
* 속성으로 밑변 높이 (double) base, height
* allArgs
* area() => 삼각형 넓이 구하기
* drawInternal() => 삼각형 그리기 ( 밑변 -**, 높이 -**)
* */
public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        double tr = (base * height)/2;
        System.out.println(tr);
        return tr;
    }

    @Override
    protected void drawInternal() {
        System.out.println("밑변 --" + base + "높이 --" + height);
    }
}
