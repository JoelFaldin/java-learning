package abstractclass;

public class Square implements Figure, Drawable {
    
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }
    
    @Override
    public double calculateArea() {
        double result = side * side;
        return result;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square! :D");
    }
    
}
