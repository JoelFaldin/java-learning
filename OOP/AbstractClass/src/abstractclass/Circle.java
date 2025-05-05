package abstractclass;

public class Circle implements Figure, Drawable, Rotable {
    
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double pi = 3.14;
        
        double result = pi * radius * radius;
        return result;
    }

    @Override
    public void rotate() {
        System.out.println("Rotating the circle!");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle!");
    }
}
