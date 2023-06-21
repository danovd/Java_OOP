package _11_Polymorphism_02_Shapes;

public class Rectangle extends Shape{
    private final double height;
    private final double width;

    public Rectangle(double height, Double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        if(super.getPerimeter() == null){
            super.setPerimeter(this.width * 2 + this.height * 2);
        }
        return super.getPerimeter();
    }

    @Override
    public double calculateArea() {
       if(super.getArea() == null){
           super.setArea(this.width * this.height);
       }
       return super.getArea();
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    protected Double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    protected Double getArea() {
        return super.getArea();
    }
}
