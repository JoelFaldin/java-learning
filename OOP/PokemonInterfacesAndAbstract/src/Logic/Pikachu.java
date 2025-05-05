package Logic;

public class Pikachu extends Pokemon implements IElectric {

    public Pikachu() {
    }

    @Override
    protected void attackTackle() {
        System.out.println("Hey im Pikachu and im attacking with tackle!");
    }

    @Override
    protected void attackScratch() {
        System.out.println("Hey im Pikachu and im attacking with scratch!");
    }

    @Override
    protected void attackBite() {
        System.out.println("Hey im Pikachu and im attacking with bite!");
    }

    @Override
    public void attackThunderShock() {
        System.out.println("Hey im Pikachi and this is my electric attack thundershock!");
    }

    @Override
    public void attackThunderFist() {
        System.out.println("Hey im Pikachi and this is my electric attack thunder fist!");
    }
    
}
