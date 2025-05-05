package Logic;

public abstract class Pokemon {
    
    protected int numPokedex;
    protected String name;
    protected double weight;
    protected String sex;
    protected int season;
    
    protected abstract void attackTackle();
    protected abstract void attackScratch();
    protected abstract void attackBite();
}
