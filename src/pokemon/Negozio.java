package pokemon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import util.Lettore;

public class Negozio{

    private double prezzoIniziale;
    private int numPacchetti;
    private ArrayList<Pokemon> poke;
    private Random rand = new Random();
    private double importoRimasto;
    private double costo;
    ColoreCarte colori = new ColoreCarte();
    
    // System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\tBEVENUTO NEL NEGOZIO");
    
    public void box(int a) {

        System.out.println(titoloNegozio());

        System.out.println("Inserisci l'importo iniziale: ");
        prezzoIniziale = Lettore.leggiDouble();

        System.out.println("\nQuanti pacchetti vuoi?");
        numPacchetti = Lettore.leggiInt();

        costo = 4.5*numPacchetti;
        importoRimasto = prezzoIniziale - costo;

            if (prezzoIniziale > costo) {
                int leggenda = collezionabili(poke);
                System.out.println(market(prezzoIniziale, numPacchetti, costo, importoRimasto, leggenda));
            } else {
                int leggenda = collezionabili(poke);
                System.out.println(market(prezzoIniziale, numPacchetti, costo, importoRimasto, leggenda));
            }
        
    }

    public int collezionabili(ArrayList<Pokemon> pokemons){
        
        poke = new ArrayList<Pokemon>();
        poke = pokemons;
        int leggende = 0;
    
        for(int i = 0; i < 5*numPacchetti; i++) {
            
            Collections.shuffle(poke);
            
            int numRand = rand.nextInt(poke.size());
            System.out.println(poke.get(numRand).scheda());
           
            if(poke.get(numRand).isLeggendario()) {
            leggende++;
            }
        }

        return leggende;
    }


    public String titoloNegozio () {
        return ConsoleColors.RED + "\r\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t" + //
                        "██████╗  ██████╗ ██╗  ██╗███████╗    ███╗   ███╗ █████╗ ██████╗ ██╗  ██╗███████╗████████╗\r\n\t\t\t\t\t\t\t" + //
                        "██╔══██╗██╔═══██╗██║ ██╔╝██╔════╝    ████╗ ████║██╔══██╗██╔══██╗██║ ██╔╝██╔════╝╚══██╔══╝\r\n\t\t\t\t\t\t\t" + //
                        "██████╔╝██║   ██║█████╔╝ █████╗      ██╔████╔██║███████║██████╔╝█████╔╝ █████╗     ██║   \r\n\t\t\t\t\t\t\t" + ConsoleColors.RESET +//
                        "██╔═══╝ ██║   ██║██╔═██╗ ██╔══╝      ██║╚██╔╝██║██╔══██║██╔══██╗██╔═██╗ ██╔══╝     ██║   \r\n\t\t\t\t\t\t\t" + //
                        "██║     ╚██████╔╝██║  ██╗███████╗    ██║ ╚═╝ ██║██║  ██║██║  ██║██║  ██╗███████╗   ██║   \r\n\t\t\t\t\t\t\t" + //
                        "╚═╝      ╚═════╝ ╚═╝  ╚═╝╚══════╝    ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝   ╚═╝   \r\n\t\t\t\t\t\t\t" + //
                        "                                                                                         \r\n\t\t\t\t\t\t\t" + //
                        "\n";
    }

    /*public double prezzoIniziale1 (double prezzoIniziale){
        return prezzoIniziale = Lettore.leggiDouble();
    }*/

    public String market(double prezzoIniziale, int numPacchetti, double costo, double importoRimasto, int leggenda) {

        return "\n\n\n\n\n\n\n\n\n\n\n\t\t\t\t" +
        "/////////////////////////////////////\r\n\t\t\t\t" + 
        "|                                   | |/////////////////////////////////////////////////////////////////////////////\r\n\t\t\t\t" +
        "|"+ConsoleColors.RED+"          ██████████████"+ConsoleColors.RESET+"           | |                                                                            |\r\n\t\t\t\t" +
        "|"+ConsoleColors.RED+"       ████████████████████"+ConsoleColors.RESET+"        | |" + "\t\t\t Importo iniziale: " + prezzoIniziale + "\t\t\t\t   |\r\n\t\t\t\t" + 
        "|"+ConsoleColors.RED+"     ████████████████████████"+ConsoleColors.RESET+"      | |                                                                            |\r\n\t\t\t\t" + 
        "|"+ConsoleColors.RED+"   ████████████████████████████"+ConsoleColors.RESET+"    | |" + "\t\t\t Numero pacchetti: " + numPacchetti + "\t\t                           |\r\n\t\t\t\t" +
        "|   ░░░░░░░░░░░░(o)░░░░░░░░░░░░░    | |                                                                            |\r\n\t\t\t\t" + 
        "|   ████████████████████████████    | |" + "\t\t\t Ogni pacchetto costa 4.50 euro" + "\t                           |\r\n\t\t\t\t" +
        "|     ████████████████████████      | |                                                                            |\r\n\t\t\t\t" +
        "|       ████████████████████        | |" + "\t\t\t Totale del carrello: "  +  costo + "\t                           |\r\n\t\t\t\t" +
        "|          ██████████████           | |                                                                            |\r\n\t\t\t\t" +
        "|                                   | |" + (prezzoIniziale > costo ? ("\t\t\t Importo rimasto: " + importoRimasto  + "\t\t                           |\r\n\t\t\t\t") : "\t\t\t Importo insufficiente \t\t\t                          |\r\n\t\t\t\t") +
        "///////////////////////////////////// |                                                                            |\r\n\t\t\t\t" +
        "|"+ConsoleColors.BLUE_BACKGROUND+"                                   "+ConsoleColors.RESET+"| |                                                                            |\r\n\t\t\t\t" +
        "|"+ConsoleColors.BLUE_BACKGROUND+"                                   "+ConsoleColors.RESET+"| |                                                                            |\r\n\t\t\t\t" +
        "|"+ConsoleColors.BLUE_BACKGROUND+"                                   "+ConsoleColors.RESET+"| |                                                                            |\r\n\t\t\t\t" +
        "|"+ConsoleColors.BLUE_BACKGROUND+"                                   "+ConsoleColors.RESET+"| |                                                                            |\r\n\t\t\t\t" +
        "|"+ConsoleColors.BLUE_BACKGROUND+"                                   "+ConsoleColors.RESET+"| |                                                                            |\r\n\t\t\t\t" +
        "|"+ConsoleColors.BLUE_BACKGROUND+"                                   "+ConsoleColors.RESET+"| |" + "\t\t\t Carte leggendarie trovate: " + leggenda + "\t                           |\r\n\t\t\t\t" +
        "|"+ConsoleColors.BLUE_BACKGROUND+"                                   "+ConsoleColors.RESET+"| |                                                                            |\r\n\t\t\t\t" +
        "///////////////////////////////////// |/////////////////////////////////////////////////////////////////////////////\r\n" +
        "\n\n\n\n\n\n\n\n\n"

        ; 
    }


    public double getPrezzoIniziale() {
        return prezzoIniziale;
    }

    public void setPrezzoIniziale(double prezzoIniziale) {
        this.prezzoIniziale = prezzoIniziale;
    }

    public int getNumPacchetti() {
        return numPacchetti;
    }

    public void setNumPacchetti(int numPacchetti) {
        this.numPacchetti = numPacchetti;
    }


    public ArrayList<Pokemon> getPoke() {
        return poke;
    }


    public void setPoke(ArrayList<Pokemon> poke) {
        this.poke = poke;
    }


    public double getImportoRimasto() {
        return importoRimasto;
    }


    public void setImportoRimasto(double importoRimasto) {
        this.importoRimasto = importoRimasto;
    }

    

    

    





}
