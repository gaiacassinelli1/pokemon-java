package pokemon;

import java.util.ArrayList;

public class ColoreCarte {

    public void coloreCarte (ArrayList<Pokemon> pokemons, int i)
    {
        if ("fire".equalsIgnoreCase(pokemons.get(i).getTipo1())) {
           System.out.println(ConsoleColors.RED + pokemons.get(i).scheda() + ConsoleColors.RESET);
        } else if ("grass".equalsIgnoreCase(pokemons.get(i).getTipo1())) {
            System.out.println(ConsoleColors.GREEN + pokemons.get(i).scheda() + ConsoleColors.RESET);
        } else if ("water".equalsIgnoreCase(pokemons.get(i).getTipo1())) {
            System.out.println(ConsoleColors.CYAN + pokemons.get(i).scheda() + ConsoleColors.RESET);
        } else if ("electric".equalsIgnoreCase(pokemons.get(i).getTipo1())) {
            System.out.println(ConsoleColors.YELLOW + pokemons.get(i).scheda() + ConsoleColors.RESET);
        } else if ("bug".equalsIgnoreCase(pokemons.get(i).getTipo1())) {
            System.out.println(ConsoleColors.GREEN + pokemons.get(i).scheda() + ConsoleColors.RESET);
        } else if ("normal".equalsIgnoreCase(pokemons.get(i).getTipo1())) {
            System.out.println(pokemons.get(i).scheda());
        } else if ("poison".equalsIgnoreCase(pokemons.get(i).getTipo1())) {
            System.out.println(ConsoleColors.PURPLE + pokemons.get(i).scheda() + ConsoleColors.RESET);
        } else if ("ground".equalsIgnoreCase(pokemons.get(i).getTipo1())) {
            System.out.println(ConsoleColors.GREEN + pokemons.get(i).scheda() + ConsoleColors.RESET);
        } else if ("fairy".equalsIgnoreCase(pokemons.get(i).getTipo1())) {
            System.out.println(ConsoleColors.CYAN + pokemons.get(i).scheda() + ConsoleColors.RESET);
        }  else if ("fighting".equalsIgnoreCase(pokemons.get(i).getTipo1())) {
            System.out.println(ConsoleColors.RED + pokemons.get(i).scheda() + ConsoleColors.RESET);
        }  else if ("psychic".equalsIgnoreCase(pokemons.get(i).getTipo1())) {
            System.out.println(ConsoleColors.PURPLE+ pokemons.get(i).scheda() + ConsoleColors.RESET);
        }  else if ("rock".equalsIgnoreCase(pokemons.get(i).getTipo1())) {
            System.out.println(ConsoleColors.GREEN + pokemons.get(i).scheda() + ConsoleColors.RESET);
        } else if ("ghost".equalsIgnoreCase(pokemons.get(i).getTipo1())) {
            System.out.println(ConsoleColors.PURPLE + pokemons.get(i).scheda() + ConsoleColors.RESET);
        } else if ("ice".equalsIgnoreCase(pokemons.get(i).getTipo1())) {
            System.out.println(ConsoleColors.CYAN + pokemons.get(i).scheda() + ConsoleColors.RESET);
        } else if ("dark".equalsIgnoreCase(pokemons.get(i).getTipo1())) {
            System.out.println(ConsoleColors.BLUE + pokemons.get(i).scheda() + ConsoleColors.RESET);
        } else if ("steel".equalsIgnoreCase(pokemons.get(i).getTipo1())) {
            System.out.println(pokemons.get(i).scheda());
        } else if ("dragon".equalsIgnoreCase(pokemons.get(i).getTipo1())) {
            System.out.println(ConsoleColors.RED + pokemons.get(i).scheda() + ConsoleColors.RESET);
        } else if ("flying".equalsIgnoreCase(pokemons.get(i).getTipo1())) {
            System.out.println(ConsoleColors.CYAN + pokemons.get(i).scheda() + ConsoleColors.RESET);
        }
    }


   

    

}
