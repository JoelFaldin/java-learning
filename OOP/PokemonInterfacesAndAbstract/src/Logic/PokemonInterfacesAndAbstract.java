package Logic;

public class PokemonInterfacesAndAbstract {

    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();
        
        squirtle.attackScratch();
        squirtle.attackHydroPump();
        
        charmander.attackScratch();
        charmander.attackFlameThrower();
        
        bulbasaur.attackScratch();
        bulbasaur.attackDrain();
        
        pikachu.attackScratch();
        pikachu.attackThunderShock();
    }
    
}
