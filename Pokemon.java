import java.util.Scanner;
public class Pokemon{
    public static void main(String []args){
        Builder bl = new Builder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your Pokemon!");
        String pokemon = sc.nextLine();
        Pokemons select = bl.getPokemon(pokemon);
        select.sayHello();
    }
}