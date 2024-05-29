import java.io.*;
import java.util.Scanner;

public class stringhe_A 
{

    public static void main(String [] args) 
    {
        Scanner scanner = new Scanner(System.in); //oggetto che legge la tastiera

        System.out.print("Inserisci una stringa: ");
        String stringa = scanner.nextLine(); //scanf

        stringa.trim(); //toglie gli spazi davanti e dietro alla stringa

        System.out.println("Stringa inserita: " + stringa);

        int lunghezza = stringa.length(); //restituisce la lunghezza della stringa
        System.out.println("lunghezza = " + lunghezza);

        char carattere = stringa.charAt(lunghezza / 2);  //restituisce il carattere all'indice passato
        System.out.println("carattere Centrale = " + carattere);

        stringa = stringa.substring(0,1).toUpperCase() + stringa.substring(1); //prende una stringa e mette la 1° lettera Maiuscola 
        System.out.println("Stringa modificata con prima lettera maiuscola = " + stringa); 

        int c = 0;
        for (int i = 0; i < stringa.length(); i++) 
        {
            if (stringa.charAt(i) == 'a') // se trov il carattere 'a' lo conta
            {
                c++; 
            }
        }
        System.out.println("Numero di 'a' = " + c);

        String sottoStringa = stringa.substring(0, 4); //copia i primi 4 caratteri
        System.out.println("Stringa dal primo al quarto carattere = " + sottoStringa);

        stringa = stringa.toUpperCase(); // fa diventare tutto maiuscolo
        System.out.println(stringa);

        stringa = stringa.toLowerCase(); // fa diventare tutto minuscolo
        System.out.println(stringa);
        
        if(isPalindromo(stringa)) System.out.println("La stringa è palindroma");
        else System.out.println("La stringa non è palindroma");


        scanner.close(); //chiude lo scanner

    }

    
     //Questa funzione restituisce true se la stringa è palindroma, false se non lo è
     
    public static boolean isPalindromo(String stringa)
    {
        for(int i = 0; i < stringa.length() / 2; i++) 
        {
            if (stringa.charAt(i)!= stringa.charAt(stringa.length() - 1 - i)) 
            {
                return false;
            }
        }
        return true;
    }

}