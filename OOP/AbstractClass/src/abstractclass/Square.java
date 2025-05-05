package abstractclass;

public class Square extends Figure {
    
    private double side;

    public Square() {
    }

    public Square(double side, double x, double y) {
        super(x, y);
        this.side = side;
    }
    
    @Override
    public double calculateArea() {
        double result = side * side;
        return result;
    }
    
}
