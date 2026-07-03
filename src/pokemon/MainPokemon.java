package pokemon;

import java.io.FileNotFoundException;
import java.util.Scanner;
import util.Lettore;

/*
 * Dato il File bisogna leggerlo e fare la lista in un aggregatore
 * Aggregatore che ha tutti i metodi per gestire la lista
 * il File e' formattato in questo modo:
 * 1,Bulbasaur,Grass,Poison,318,45,49,49,65,66,45,1,false
 * numPoke
 * nome
 * tipo1
 * tipo2
 * hp - vita
 * att - attacco
 * def - difesa
 * spAtt - attacco speciale
 * spDef - difesa speciale
 * spd - velocita
 * gen - generazione
 * leg - leggendario
 * 
 * 1 - Collezionabili, fare in modo che il programma estragga 5 pokemon A CASO
 * 2 - Poter cercare nell'archivio che pokemon ci sono, per ogni dato che hanno  
 */

public class MainPokemon {

    public static void main(String[] args) throws FileNotFoundException {

    Scanner tastiera = new Scanner(System.in);  

    PokedexAGG pk = new PokedexAGG("C:/Users/Utente/Downloads/POKEMON PROJECT JAVA/pokemon/res/pokemon.txt");
    /* for (Pokemon pokemon : pk.pokemons) {
            System.out.println(pokemon.scheda());
        } */ 
    
    Negozio negozio = new Negozio();
    boolean logout = false;
    //Gioca gioca = new Gioca();
    //ColoreCarte colori = new ColoreCarte();

    do{
    System.out.println(pk.logoIniziale());
    System.err.println("\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t\tPremi enter per iniziare");

    while("".equals(tastiera.nextLine())){

        System.out.println(pk.pokeball());
       
    //System.out.println("\nE ricorda, gotta catch'em all. Prendili e vedrai!!");

    switch (Lettore.leggiString()) {
        case "1":                                   //GIOCA
        //System.out.println(gioca.intro1(pk.pokemons));
        //gioca.menuGioca(pk.pokemons);
            break;
        
        case "2":                                      //CERCA
        
        do {System.out.println(pk.stampaLogoPokedex());       
                                                    
            System.out.println(pk.menuPokedex());
            
                switch (Lettore.leggiString()) {
                case "1":
                pk.stampaPokedex();
                    break;
                
                case "2":
                
                do{System.out.println(pk.ricercheSingole());
    
                switch(Lettore.leggiString()) {
                    case "1": 
                    System.out.println("Digita il nome del pokemon che vuoi cercare");
                    pk.cercaPerNome(Lettore.leggiString());
                        break;
                
                    case "2": 
                    System.out.println("Digita il numero del pokemon che vuoi cercare");
                    pk.cercaPerNum(Lettore.leggiInt());
                        break;
                
                    case "3": 
                    System.out.println("Digita il tipo del pokemon che vuoi cercare");
                    pk.cercaPerTipo(Lettore.leggiString());
                        break;
                
                    case "4": 
                    System.out.println("Digita la generazione del pokemon che vuoi cercare");
                    pk.cercaPerGen(Lettore.leggiInt());
                        break;
                
                    case "5": 
                    System.out.println("Cerca i pokemon leggendari");
                    pk.cercaPerLegg();
                        break;
                    }
                }while("".equals(tastiera.nextLine()));
        
                case "3": 
                System.out.println(pk.pokeball());
                    break;

                default:
                System.out.println("Errore");
                    break;
                }
            
            System.out.println("Premi enter per tornare indietro");
            
        }while("".equals(tastiera.nextLine()));
            break;
        
        case "3":                               //NEGOZIO
            int a = negozio.collezionabili(pk.pokemons);  
            negozio.box(a);             
                break;

        case "4":                               //ESCI
            logout = true;
            System.out.println(pk.chiusura());
            System.out.println("Chiusura...");
                break;

        default:
        System.out.println("ERRORE");
            break;
    }
    }
}while(!logout);


//TUTTO IL PROGRAMMA SI CHIUDE ALLE 24 E RIPRENDE ALLE 6
        

tastiera.close();
    }

   
    
}

