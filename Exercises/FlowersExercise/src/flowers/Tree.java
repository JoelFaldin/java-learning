package flowers;

public class Tree extends Plant {
    private String type;
    private String logType;
    private double logRadius;
    private String color;
    private String leafType;

    public Tree() {
    }

    public Tree(String type, String logType, double logRadius, String color, String leafType) {
        this.type = type;
        this.logType = logType;
        this.logRadius = logRadius;
        this.color = color;
        this.leafType = leafType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public double getLogRadius() {
        return logRadius;
    }

    public void setLogRadius(double logRadius) {
        this.logRadius = logRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLeafType() {
        return leafType;
    }

    public void setLeafType(String leafType) {
        this.leafType = leafType;
    }

    // Methods:
    @Override
    public void sayWhatItIs() {
        System.out.println("Hello there! Im a tree!");
    }
}
