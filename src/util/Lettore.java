package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Per utilizzare i metodi di questa classe ci basta richiamare all'occorrenza
 * {@code Lettore.metodoScelto()}, ovunque vogliate, senza aver bisogno di
 * creare una
 * variabile di tipo Scanner
 * 
 */
public class Lettore {

    static Scanner tastiera = new Scanner(System.in);

    public static void premiInvioPerContinuare() {
        System.out.println("Premi invio per continuare ...");
        tastiera.nextLine();
    }

    /**
     * Metodo che restituisce una stringa letta da console
     * 
     * @return {@code String} inserita in console da tastiera
     */
    public static String leggiString() {
      //  System.out.println(" -- Inserisci una stringa ...");
        return tastiera.nextLine();
    }

    /**
     * Metodo che restituisce esito POSITIVO o NEGATIVO in base a input da tastiera
     * 
     * @return {@code true} se input == { s, si, y, v, vero } tutto il resto
     *         {@code false}
     */
    public static boolean leggiSiNo() {
        String input = tastiera.nextLine();

        return "s".equalsIgnoreCase(input)
                || "si".equalsIgnoreCase(input)
                || "y".equalsIgnoreCase(input)
                || "v".equalsIgnoreCase(input)
                || "vero".equalsIgnoreCase(input)
                || "".equalsIgnoreCase(input)
                || "true".equalsIgnoreCase(input);

        /*
         * switch (input) {
         * case "s":
         * case "si":
         * case "sÃ¬":
         * case "y":
         * case "v":
         * case "vero":
         * return true;
         * 
         * default:
         * return false;
         * }
         */

    }

    /**
     * Metodo che restituisce un intero
     * ATTENZIONE WorkInProgress, errore applicazione se viene inserito qualcosa di
     * diverso da un numero
     * 
     * @return {@code int} con il numero intero inserito
     */
    public static int leggiInt() {
      //  System.out.println(" -- Inserisci un intero ...");
        return Integer.parseInt(tastiera.nextLine());
    }

    /**
     * Metodo che restituisce un decimale, intero.decimale, attenzione a non usare
     * virgola
     * ATTENZIONE WorkInProgress, errore applicazione se viene inserito qualcosa di
     * diverso da un numero
     * 
     * @return {@code double} con il numero decimale inserito
     */
    public static double leggiDouble() {
      //  System.out.println(" -- Inserisci un decimale ...");
        return Double.parseDouble(tastiera.nextLine());
    }

    /**
     * Metodo che restituisce un una data di tipo LocalDate
     * ATTENZIONE WorkInProgress, errore applicazione se viene inserito qualcosa di
     * diverso da un numero nelle varie fasi
     * oppure se viene inserita una data non fattibile e fuori scala
     * 
     * @return {@code LocalDate} con Anno-Mese-Giorno inserito
     */
    public static LocalDate leggiData() {
        System.out.println(" -- Inserisci anno ...");
        int anno = Integer.parseInt(tastiera.nextLine());
        System.out.println(" -- Inserisci mese in numero ...");
        int mese = Integer.parseInt(tastiera.nextLine());
        System.out.println(" -- Inserisci giorno ...");
        int giorno = Integer.parseInt(tastiera.nextLine());
        return LocalDate.of(anno, mese, giorno);
    }

    /**
     * Metodo che restituisce un una data di tipo LocalTime
     * ATTENZIONE WorkInProgress, errore applicazione se viene inserito qualcosa di
     * diverso da un numero nelle varie fasi.
     * 
     * @return {@code LocalTime} con Ora-Minuti inserito
     */
    public static LocalTime leggiOra() {
        System.out.println(" -- Inserisci ora ...");
        int ora = Integer.parseInt(tastiera.nextLine());
        System.out.println(" -- Inserisci minuti ...");
        int minuti = Integer.parseInt(tastiera.nextLine());
        return LocalTime.of(ora, minuti);
    }

    /**
     * Metodo che restituisce un una data di tipo LocalDateTime
     * ATTENZIONE WorkInProgress, errore applicazione se viene inserito qualcosa di
     * diverso da un numero nelle varie fasi.
     * 
     * @return {@code LocalDateTime} con Anno-Mese-Giorno Ora-Minuti inserito
     */
    public static LocalDateTime leggiDataOra() {
        return LocalDateTime.of(leggiData(), leggiOra());
    }

    public static ArrayList<String> leggiFile(String percorso) throws FileNotFoundException {
        ArrayList<String> risultato = new ArrayList<String>();

        Scanner file = new Scanner(new File(percorso));
        while (file.hasNextLine()) {
            risultato.add(file.nextLine());
        }
        file.close();

        return risultato;
    }

    public static int leggiMese() {
        String[] mesi = new String[] {
                "Gennaio",
                "Febbraio",
                "Marzo",
                "Aprile",
                "Maggio",
                "Giugno",
                "Luglio",
                "Agosto",
                "Settembre",
                "Ottobre",
                "Novembre",
                "Dicembre"
        };

        System.out.println("Inserisci mese in numeri o lettere");
        String input = leggiString();

        for (int i = 0; i < mesi.length; i++) {
            if (input.equalsIgnoreCase(mesi[i])) {
                return i + 1;
            }
        }

        return Integer.parseInt(input);

    }
}
