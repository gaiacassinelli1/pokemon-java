package pokemon;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

//AGGREGATORE

public class PokedexAGG {
    
    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    ColoreCarte colore = new ColoreCarte();

    PokedexAGG(String pathFile) throws FileNotFoundException{
        
        Scanner file = new Scanner(new File(pathFile));
        while(file.hasNextLine()) {
            String row = file.nextLine();
            Pokemon nuovoPokemon = new Pokemon(row);
            pokemons.add(nuovoPokemon);
        }
        file.close();
    }
        
    public String logoIniziale() {
        return ConsoleColors.RED + "\n\n\n\n\n\n\n\n\n\n\n\r\n\t\t\t\t\t" + //
                        "██████╗  ██████╗ ██╗  ██╗███████╗███╗   ███╗ ██████╗ ███╗   ██╗     ██████╗ █████╗ ███████╗███████╗███████╗\r\n\t\t\t\t\t" + //
                        "██╔══██╗██╔═══██╗██║ ██╔╝██╔════╝████╗ ████║██╔═══██╗████╗  ██║    ██╔════╝██╔══██╗██╔════╝██╔════╝██╔════╝\r\n\t\t\t\t\t" + //
                        "██████╔╝██║   ██║█████╔╝ █████╗  ██╔████╔██║██║   ██║██╔██╗ ██║    ██║     ███████║█████╗  █████╗  █████╗  \r\n\t\t\t\t\t" + ConsoleColors.RESET +//
                        "██╔═══╝ ██║   ██║██╔═██╗ ██╔══╝  ██║╚██╔╝██║██║   ██║██║╚██╗██║    ██║     ██╔══██║██╔══╝  ██╔══╝  ██╔══╝  \r\n\t\t\t\t\t" + //
                        "██║     ╚██████╔╝██║  ██╗███████╗██║ ╚═╝ ██║╚██████╔╝██║ ╚████║    ╚██████╗██║  ██║██║     ██║     ███████╗\r\n\t\t\t\t\t" + //
                        "╚═╝      ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═══╝     ╚═════╝╚═╝  ╚═╝╚═╝     ╚═╝     ╚══════╝\r\n\t\t\t\t\t" + //
                        "                                                                                                           \r\n\t\t\t\t\t" + //
                        "";
    }



    public String stampaLogoPokedex() {
        return ConsoleColors.RED + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\r\n\t\t\t\t\t\t\t\t\t" + //
                        "██████╗  ██████╗ ██╗  ██╗███████╗██████╗ ███████╗██╗  ██╗\r\n\t\t\t\t\t\t\t\t\t" + //
                        "██╔══██╗██╔═══██╗██║ ██╔╝██╔════╝██╔══██╗██╔════╝╚██╗██╔╝\r\n\t\t\t\t\t\t\t\t\t" + //
                        "██████╔╝██║   ██║█████╔╝ █████╗  ██║  ██║█████╗   ╚███╔╝ \r\n\t\t\t\t\t\t\t\t\t" +  ConsoleColors.RESET +//
                        "██╔═══╝ ██║   ██║██╔═██╗ ██╔══╝  ██║  ██║██╔══╝   ██╔██╗ \r\n\t\t\t\t\t\t\t\t\t" + //
                        "██║     ╚██████╔╝██║  ██╗███████╗██████╔╝███████╗██╔╝ ██╗\r\n\t\t\t\t\t\t\t\t\t" + //
                        "╚═╝      ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═════╝ ╚══════╝╚═╝  ╚═╝\r\n\t\t\t\t\t\t\t\t\t" + //
                        "                                                         \r\n\t\t\t\t\t\t\t\t\t" + //
                        "\n" ;
    }

    public String pokeball() {
        return ConsoleColors.RED + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t" +
        "                  ██████████████████████████████████\r\n\t\t\t\t\t\t\t\t" + //            
        "                ██████████████████████████████████████\r\n\t\t\t\t\t\t\t\t" + //
        "              ██████████████████████████████████████████\r\n\t\t\t\t\t\t\t\t" + //
        "            ████  ████  ██        ██   ███  ██  ████  ████\r\n\t\t\t\t\t\t\t\t" + //
        "          ██████   ██   ██  ████████    ██  ██  ████  ██████\r\n\t\t\t\t\t\t\t\t" + //
        "        ████████        ██      ████  █  █  ██  ████  ████████\r\n\t\t\t\t\t\t\t\t" + //
        "      ██████████  █  █  ██  ████████  ██    ██  ████  ██████████\r\n\t\t\t\t\t\t\t\t" + //
        "    ████████████  ████  ██        ██  ███   ███      █████████████\r\n\t\t\t\t\t\t\t\t" + //
        "   ████████████████████████████████████████████████████████████████\r\n\t\t\t\t\t\t\t\t" + //
        "  ██████████████████████████████████████████████████████████████████\r\n\t\t\t\t\t\t\t\t" + //
        " ████████████████████████████████████████████████████████████████████\r\n\t\t\t\t\t\t\t\t" + ConsoleColors.RESET +  //
        " ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\r\n\t\t\t\t\t\t\t\t" + //
        " ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░███████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░\r\n\t\t\t\t\t\t\t\t" + //
        " ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░███████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░\r\n\t\t\t\t\t\t\t\t" + //
        " ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\r\n\t\t\t\t\t\t\t\t" +//
        " ████████████████████████████████████████████████████████████████████\r\n\t\t\t\t\t\t\t\t" + // 
        "  ██████████████████████████████████████████████████████████████████\r\n\t\t\t\t\t\t\t\t" + //
        "   ███████████████████████"+"1 - Gioca!"+"███████████████████████████████\r\n\t\t\t\t\t\t\t\t" + //          
        "    ██████████████████████████████████████████████████████████████\r\n\t\t\t\t\t\t\t\t" + //
        "      ███████████████████"+"2 - Apri il pokedex"+"████████████████████\r\n\t\t\t\t\t\t\t\t" + //
        "        ██████████████████████████████████████████████████████\r\n\t\t\t\t\t\t\t\t" + //
        "          ████████████████"+"3- Negozio"+"████████████████████████\r\n\t\t\t\t\t\t\t\t" + //
        "            ██████████████████████████████████████████████\r\n\t\t\t\t\t\t\t\t" + //
        "              █████████████"+"4 - Esci"+"█████████████████████\r\n\t\t\t\t\t\t\t\t" + //
        "                 █████████████████████████████████████\r\n\t\t\t\t\t\t\t\t" + //    
        "                    ███████████████████████████████\r\n\t\t\t\t\t\t\t\t"  +//
        "\n\n\n\n\n\n"  
        
        ; 
    }

    public String menuPokedex() {
        return 
        "\n\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t" + ConsoleColors.RED +
        "   █████████\r\n\t\t\t\t\t\t\t\t\t\t" +
        " █████████████\r\n\t\t\t\t\t\t\t\t\t\t" + ConsoleColors.RESET +
        " ░░░░░(1)░░░░░" + " - Esplora tutti i pokemon\r\n\t\t\t\t\t\t\t\t\t\t" +
        " █████████████\r\n\t\t\t\t\t\t\t\t\t\t" +
        "   █████████\r\n\t\t\t\t\t\t\t\t\t\t" + 
        "\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t"  +  ConsoleColors.RED + 
        "   █████████\r\n\t\t\t\t\t\t\t\t\t\t" + 
        " █████████████\r\n\t\t\t\t\t\t\t\t\t\t" + ConsoleColors.RESET +  
        " ░░░░░(2)░░░░░" + " - Fai ricerche singole\r\n\t\t\t\t\t\t\t\t\t\t" +
        " █████████████\r\n\t\t\t\t\t\t\t\t\t\t" + 
        "   █████████\r\n\t\t\t\t\t\t\t\t\t\t" + 
        "\n\t\t\t\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t\t\t\t" + ConsoleColors.RED +
        "   █████████\r\n\t\t\t\t\t\t\t\t\t\t" +
        " █████████████\r\n\t\t\t\t\t\t\t\t\t\t" + ConsoleColors.RESET +
        " ░░░░░(3)░░░░░" + " - Torna al menù principale\r\n\t\t\t\t\t\t\t\t\t\t" +
        " █████████████\r\n\t\t\t\t\t\t\t\t\t\t" +
        "   █████████\r\n\t\t\t\t\t\t\t\t\t\t"  +
        "\n\n";

    }

    public String ricercheSingole () {
        return 
        "\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t"  +  ConsoleColors.RED + 
        "   █████████\r\n\t\t\t\t\t\t\t\t\t\t" + 
        " █████████████\r\n\t\t\t\t\t\t\t\t\t\t" + ConsoleColors.RESET +  
        " ░░░░░(1)░░░░░" + " - Cerca per nome\r\n\t\t\t\t\t\t\t\t\t\t" +
        " █████████████\r\n\t\t\t\t\t\t\t\t\t\t" + 
        "   █████████\r\n\t\t\t\t\t\t\t\t\t\t" + 
        "\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t" + ConsoleColors.RED +
        "   █████████\r\n\t\t\t\t\t\t\t\t\t\t" + 
        " █████████████\r\n\t\t\t\t\t\t\t\t\t\t" + ConsoleColors.RESET +
        " ░░░░░(2)░░░░░" + " - Cerca per numero\r\n\t\t\t\t\t\t\t\t\t\t" + 
        " █████████████\r\n\t\t\t\t\t\t\t\t\t\t" +
        "   █████████\r\n\t\t\t\t\t\t\t\t\t\t" + 
        "\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t" + ConsoleColors.RED +
        "   █████████\r\n\t\t\t\t\t\t\t\t\t\t" +
        " █████████████\r\n\t\t\t\t\t\t\t\t\t\t" + ConsoleColors.RESET +
        " ░░░░░(3)░░░░░" + " - Cerca per tipo\r\n\t\t\t\t\t\t\t\t\t\t" +
        " █████████████\r\n\t\t\t\t\t\t\t\t\t\t" +
        "   █████████\r\n\t\t\t\t\t\t\t\t\t\t"  + 
        "\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t" + ConsoleColors.RED +
        "   █████████\r\n\t\t\t\t\t\t\t\t\t\t" +
        " █████████████\r\n\t\t\t\t\t\t\t\t\t\t" + ConsoleColors.RESET +
        " ░░░░░(4)░░░░░" + " - Cerca per generazione\r\n\t\t\t\t\t\t\t\t\t\t" +
        " █████████████\r\n\t\t\t\t\t\t\t\t\t\t" +
        "   █████████\r\n\t\t\t\t\t\t\t\t\t\t"  + 
        "\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t" + ConsoleColors.RED +
        "   █████████\r\n\t\t\t\t\t\t\t\t\t\t" +
        " █████████████\r\n\t\t\t\t\t\t\t\t\t\t" + ConsoleColors.RESET +
        " ░░░░░(5)░░░░░" + " - Cerca i leggendari\r\n\t\t\t\t\t\t\t\t\t\t" + 
        " █████████████\r\n\t\t\t\t\t\t\t\t\t\t" +
        "   █████████\r\n\t\t\t\t\t\t\t\t\t\t"   ;
    }

    /*public String miniPokedeball () {
        return "" 
        + ConsoleColors.RED +
        "   █████████" +
        " █████████████" + ConsoleColors.RESET +
        " ░░░░░(1)░░░░░" +
        " █████████████" +
        "   █████████" 
    ; 
    }*/
    
    public void stampaPokedex() {
        for (int i = 0; i < pokemons.size(); i++) {
            colore.coloreCarte(pokemons, i);
        }
    }

    public void cercaPerNome(String nomeScelto) {
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i).getNome().equalsIgnoreCase(nomeScelto)) {
                colore.coloreCarte(pokemons, i);
            }
        }
    }

    public void cercaPerNum(int numScelto) {
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i).getPos() == numScelto) {
                colore.coloreCarte(pokemons, i);
            }
        }
    }

    public void cercaPerTipo(String tipoScelto) {
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i).getTipo1().equalsIgnoreCase(tipoScelto) || (pokemons.get(i).getTipo2().equalsIgnoreCase(tipoScelto))) {
                colore.coloreCarte(pokemons, i);
            }
        }
    }

    public void cercaPerGen(int genScelta) {
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i).getGen() == genScelta) {
                colore.coloreCarte(pokemons, i);
            }
        }
    }

    public void cercaPerLegg() {
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i).isLeggendario()) {
                colore.coloreCarte(pokemons, i);
            }
        }
    }

    public String chiusura() {
        return ConsoleColors.RED + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\r\n" + //
                        "                                                                                       \r\n\t\t\t\t\t\t\t" + //
                        " @@@@@@@@   @@@@@@   @@@@@@@@@@   @@@@@@@@      @@@@@@   @@@  @@@  @@@@@@@@  @@@@@@@   \r\n\t\t\t\t\t\t\t" + //
                        "@@@@@@@@@  @@@@@@@@  @@@@@@@@@@@  @@@@@@@@     @@@@@@@@  @@@  @@@  @@@@@@@@  @@@@@@@@  \r\n\t\t\t\t\t\t\t" + //
                        "!@@        @@!  @@@  @@! @@! @@!  @@!          @@!  @@@  @@!  @@@  @@!       @@!  @@@  \r\n\t\t\t\t\t\t\t" + //
                        "!@!        !@!  @!@  !@! !@! !@!  !@!          !@!  @!@  !@!  @!@  !@!       !@!  @!@  \r\n\t\t\t\t\t\t\t" + //
                        "!@! @!@!@  @!@!@!@!  @!! !!@ @!@  @!!!:!       @!@  !@!  @!@  !@!  @!!!:!    @!@!!@!   \r\n\t\t\t\t\t\t\t" + //
                        "!!! !!@!!  !!!@!!!!  !@!   ! !@!  !!!!!:       !@!  !!!  !@!  !!!  !!!!!:    !!@!@!    \r\n\t\t\t\t\t\t\t" + //
                        ":!!   !!:  !!:  !!!  !!:     !!:  !!:          !!:  !!!  :!:  !!:  !!:       !!: :!!   \r\n\t\t\t\t\t\t\t" + //
                        ":!:   !::  :!:  !:!  :!:     :!:  :!:          :!:  !:!   ::!!:!   :!:       :!:  !:!  \r\n\t\t\t\t\t\t\t" + //
                        " ::: ::::  ::   :::  :::     ::    :: ::::     ::::: ::    ::::     :: ::::  ::   :::  \r\n\t\t\t\t\t\t\t" + //
                        " :: :: :    :   : :   :      :    : :: ::       : :  :      :      : :: ::    :   : :  \r\n\t\t\t\t\t\t\t" + //
                        "                                                                                       \r\n\t\t\t\t\t\t\t" + //
                        "\n\n\n\n\n\n\n\n\n\n\n\n" + ConsoleColors.RESET;
    }


    


    

    

    
}