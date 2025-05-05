package Logic;

public class Charmander extends Pokemon implements IFire {

    public Charmander() {
    }

    @Override
    protected void attackTackle() {
        System.out.println("Hey im Charmander and im attacking with tackle!");
    }

    @Override
    protected void attackScratch() {
        System.out.println("Hey im Charmander and im attacking with scratch!");
    }

    @Override
    protected void attackBite() {
        System.out.println("Hey im Charmander and im attacking with bite!");
    }

    @Override
    public void attackFirePunch() {
        System.out.println("Hey im Charmander and this is my fire attack fire punch!");
    }

    @Override
    public void attackFlameThrower() {
        System.out.println("Hey im Charmander and this is my fire attack flame thrower!");
    }

    @Override
    public void attackEmber() {
        System.out.println("Hey im Charmander and this is my fire attack ember!");
    }
    
}
