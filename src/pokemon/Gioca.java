/*package pokemon;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;
import java.util.Random;
import util.Lettore;


public class Gioca {
 //variabili 
  String user;
 //ArrayList<Pokemon> poke;
  static Random rand = new Random();
  ColoreCarte colore = new ColoreCarte();
  int i;
  
  //chiamo il costruttore dell array

//indtroduzione dopo il gioca
  public String intro1 (ArrayList<Pokemon> pokemons){ 
    
    ArrayList<Pokemon> pokegioca = new ArrayList<Pokemon>();
    pokegioca = pokemons;

  return "\nBenvenuti, giovani Allenatori Pokémon! Mi chiamo Professor Oak, e sono qui per guidarvi nel meraviglioso mondo dei Pokémon." +
  "\nCome sapete, i Pokémon sono creature straordinarie che vivono in armonia con noi umani." +
  "\nEssi abitano terre selvagge, mari profondi e addirittura il cielo stesso." +
  "\nquesto che vedete è un Pokémon \n\n\t\t" + pokegioca.get(15).scheda() + 
  "Per alcuni, i Pokémon sono animali domestici, altri li usano per combattere. \nIo studio i Pokémon come professione." +
  "\nPerò prima dimmi come ti chiami?\n";

  }

//scelta nome dell utente
  public String scltNome(){
    return Lettore.leggiString();
  }

//continuazione dell'inroduzione con la chiamata del nome proprio dell'utente
public String intro2(){
  return"Bene! il tuo nome è " + user.toUpperCase() + "!\n"+ 
  user.toUpperCase() + ", la tua leggenda nel mondo pokemon sta per iniziare.\n" + 
  "Ti aspetta un mondo di sogni e avventure con i pokemon! Andiamo!\n " ;
  }

//scelta della modalità di gioco se veloce(1 solo incontro) oppure storia campione(4 incontri di seguito)
public String modalità(){
  return "Per iniziare l'avventura scegli la modlità di gioco!"+ 
  "\n1-Affronta il Team Rocket" + 
  "\n2-Diventa il Campione della lega Pokèmon-\n";
}

public void menuGioca(ArrayList<Pokemon> pokemons) {
  
  System.out.println(intro1(pokemons));

  user = scltNome();
  //user = Lettore.leggiString();

  System.out.println(intro2());

  System.err.println(modalità());

  switch(Lettore.leggiInt()) {
        case 1:
            System.out.println("Hai scelto di affrontare il Team Rocket!");
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Affronta Meowth");
            System.out.println("2. Affronta Jessie e James");
            System.out.println("3. Affronta Giovanni");
            System.out.println("4. Fuggi");
            
            switch(Lettore.leggiInt()) {
            case 1:
                System.out.println("Hai scelto di affrontare Meowth!");
                // Codice per l'azione
                    break;
            case 2:
                System.out.println("Hai scelto di affrontare Jessie e James!");
                // Codice per l'azione
                    break;
            case 3:
                System.out.println("Hai scelto di affrontare un Giovanni!");
                // Codice per l'azione
                    break;
            case 4:
                System.out.println("Hai scelto di fuggire!");
                // Codice per l'azione
                    break;
            default:
                System.out.println("Scelta non valida!");
                    break;
            }   
            break;


        case 2 :
            System.out.println("Hai scelto di diventare Campione Pokémon!");

            System.out.println("Perfetto ora dovrai sfidare il primo Superquattro....LANCE");

            System.out.println("Perfetto ora dovrai sfidare il secondo Superquattro....KAREN");

            System.out.println("Perfetto ora dovrai sfidare il terzo Superquattro....CAMILLA");

            System.out.println("Perfetto ora dovrai sfidare il CAMPIONE ....DANDEL");

            
//frase finale 
            System.out.println("Ogni battaglia, ogni vittoria e anche ogni sconfitta hanno contribuito a plasmare il nostro viaggio. Ora, qui, in questo momento, abbiamo dimostrato il nostro valore, la nostra determinazione e il nostro legame con i nostri amati Pokémon.");
            System.out.println("Battendo la Lega Pokémon, non solo hai conquistato il titolo di Campione, ma hai anche dimostrato che con impegno, dedizione e fiducia nei nostri compagni Pokémon, non c'è sfida che non possiamo superare.");
            System.out.println("Ora che la nostra avventura giunge al termine, ricorderemo sempre i giorni trascorsi insieme e l'eccitazione di ogni nuova scoperta. Ma anche se i nostri viaggi possono essere finiti per ora, il legame tra noi e i nostri Pokémon rimarrà per sempre.");
            break;

        default:
        System.out.println("Scelta non valida!");
        break;
    }
  }




    
//parte randomica del proprio e del pokemon avversario             
            
 private static final PokedexAGG POKEDEX = PokedexAGG.get();

 public static void randomPokemons(ArrayList<Pokemon> team) {
  ArrayList<Pokemon> pokedex = POKEDEX.getNewDex();
  Collections.shuffle(pokedex);
  for (int i = 0; i < 1; i++) {
  int numRand = rand.nextInt(pokedex.size());
  team.add(pokedex.get(numRand));
  }
    
    
          

  
    
                
}





}*/