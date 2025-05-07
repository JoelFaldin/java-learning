package flowers;

public class Bush extends Plant {
    private double bushWidth;
    private boolean isDomestic;
    private String bushType;
    private String leafColor;
    private boolean canBeTrimmed;

    public Bush() {
    }

    public Bush(double bushWidth, boolean isDomestic, String bushType, String leafColor, boolean canBeTrimmed) {
        this.bushWidth = bushWidth;
        this.isDomestic = isDomestic;
        this.bushType = bushType;
        this.leafColor = leafColor;
        this.canBeTrimmed = canBeTrimmed;
    }

    public double getBushWidth() {
        return bushWidth;
    }

    public void setBushWidth(double bushWidth) {
        this.bushWidth = bushWidth;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }

    public String getBushType() {
        return bushType;
    }

    public void setBushType(String bushType) {
        this.bushType = bushType;
    }

    public String getLeafColor() {
        return leafColor;
    }

    public void setLeafColor(String leafColor) {
        this.leafColor = leafColor;
    }

    public boolean isCanBeTrimmed() {
        return canBeTrimmed;
    }

    public void setCanBeTrimmed(boolean canBeTrimmed) {
        this.canBeTrimmed = canBeTrimmed;
    }

    // Methods:
    @Override
    public void sayWhatItIs() {
        System.out.println("Hello! Im a bush!");
    }
}
