package Logic;

public class Squirtle extends Pokemon implements IWater {

    public Squirtle() {
    }

    @Override
    protected void attackTackle() {
        System.out.println("Hey im Squirtle and im attacking with tackle!");
    }

    @Override
    protected void attackScratch() {
        System.out.println("Hey im Squirtle and im attacking with scratch!");
    }

    @Override
    protected void attackBite() {
        System.out.println("Hey im Squirtle and im attacking with bite!");
    }

    @Override
    public void attackHydroPump() {
        System.out.println("Hey im Squirtle and this is my water attack hydro pump!");
    }

    @Override
    public void attackBubble() {
        System.out.println("Hey im Squirtle and this is my water attack bubble!");
    }

    @Override
    public void attackWaterGun() {
        System.out.println("Hey im Squirtle and this is my water attack water gun!");
    }
    
}
