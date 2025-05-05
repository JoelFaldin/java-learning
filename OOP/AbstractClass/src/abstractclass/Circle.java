package abstractclass;

public class Circle extends Figure {
    
    private double radius;

    public Circle() {
    }

    public Circle(double radius, double x, double y) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double pi = 3.14;
        
        double result = pi * radius * radius;
        return result;
    }
}
