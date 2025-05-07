package flowers;

public abstract class Plant {
    private String name;
    private double height;
    private boolean hasLeaves;
    private String idealWeather;

    public Plant() {
    }

    public Plant(double height, String name, boolean hasLeaves, String idealWeather) {
        this.height = height;
        this.name = name;
        this.hasLeaves = hasLeaves;
        this.idealWeather = idealWeather;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHasLeaves() {
        return hasLeaves;
    }

    public void setHasLeaves(boolean hasLeaves) {
        this.hasLeaves = hasLeaves;
    }

    public String getIdealWeather() {
        return idealWeather;
    }

    public void setIdealWeather(String idealWeather) {
        this.idealWeather = idealWeather;
    }

    // Abstract methods:
    public abstract void sayWhatItIs();
}
