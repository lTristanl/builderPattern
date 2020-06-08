import java.util.Scanner;
public class Builder{
    public Pokemons getPokemon(String pokemon){
        if(pokemon == null)
            return new Error();
        if(pokemon.equalsIgnoreCase("CHARMANDER"))
            return new Charmander();
        else if(pokemon.equalsIgnoreCase("BULBASSAUR"))
            return new Bulbassaur();
        else if(pokemon.equalsIgnoreCase("SQUIRTLE"))
            return new Squirtle();
        return new Error();
    }
}