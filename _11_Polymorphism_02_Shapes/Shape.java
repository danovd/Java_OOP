package _11_Polymorphism_02_Shapes;

public abstract class Shape {
private double perimeter;
private double area;

public abstract double calculatePerimeter();
public abstract double calculateArea();

    protected Double getPerimeter(){
        return this.perimeter;
    }
    protected Double getArea(){
        return this.area;
    }

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    protected void setArea(Double area) {
        this.area = area;
    }
}
