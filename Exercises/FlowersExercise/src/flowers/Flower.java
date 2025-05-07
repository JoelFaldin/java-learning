package flowers;

public class Flower extends Plant {
    private String petalType;
    private int averageAmountOfPetals;
    private String gynoeciumColor;
    private String petalsColor;
    private String flowerVariety;
    private String bloomSeason;

    public Flower() {
    }

    public Flower(String petalType, int averageAmountOfPetals, String gynoeciumColor, String petalsColor, String flowerVariety, String bloomSeason) {
        this.petalType = petalType;
        this.averageAmountOfPetals = averageAmountOfPetals;
        this.gynoeciumColor = gynoeciumColor;
        this.petalsColor = petalsColor;
        this.flowerVariety = flowerVariety;
        this.bloomSeason = bloomSeason;
    }

    public String getPetalType() {
        return petalType;
    }

    public void setPetalType(String petalType) {
        this.petalType = petalType;
    }

    public int getAverageAmountOfPetals() {
        return averageAmountOfPetals;
    }

    public void setAverageAmountOfPetals(int averageAmountOfPetals) {
        this.averageAmountOfPetals = averageAmountOfPetals;
    }

    public String getGynoeciumColor() {
        return gynoeciumColor;
    }

    public void setGynoeciumColor(String gynoeciumColor) {
        this.gynoeciumColor = gynoeciumColor;
    }

    public String getPetalsColor() {
        return petalsColor;
    }

    public void setPetalsColor(String petalsColor) {
        this.petalsColor = petalsColor;
    }

    public String getFlowerVariety() {
        return flowerVariety;
    }

    public void setFlowerVariety(String flowerVariety) {
        this.flowerVariety = flowerVariety;
    }

    public String getBloomSeason() {
        return bloomSeason;
    }

    public void setBloomSeason(String bloomSeason) {
        this.bloomSeason = bloomSeason;
    }

    // Methods:
    @Override
    public void sayWhatItIs() {
        System.out.println("Hello! Im a flower!");
    }
}
