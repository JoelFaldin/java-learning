package Logic;

public class Bulbasaur extends Pokemon implements IPlant {

    public Bulbasaur() {
    }

    @Override
    protected void attackTackle() {
        System.out.println("Hey im Bulbasaur and im attacking with tackle!");
    }

    @Override
    protected void attackScratch() {
        System.out.println("Hey im Bulbasaur and im attacking with scratch!");
    }

    @Override
    protected void attackBite() {
        System.out.println("Hey im Bulbasaur and im attacking with bite!");
    }

    @Override
    public void attackDrain() {
        System.out.println("Hey im Bulbasaur and this is my attack drain!");
    }

    @Override
    public void attackParalize() {
        System.out.println("Hey im Bulbasaur and this is my attack paralize!");
    }
    
}
