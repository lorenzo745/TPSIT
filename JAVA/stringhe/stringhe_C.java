 // esercizio c
import java.io.*;
import java.util.Scanner;

public class stringhe_C 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); //oggetto che legge la tastiera

        // controlla se un numero di telefono è valido
        System.out.println("Inserisci un numero di telefono: ");
        String stringa = scanner.nextLine();

        boolean c = true; // variabile di controllo

        for (int i = 0; i < stringa.length(); i++) 
        {
            if (!Character.isDigit(stringa.charAt(i))) // controlla se è una cifra
            {
                c = false;
            }
        }

        // se sono tutte cifre, sono 10 cifre, e la prima è un 3
        if (c && stringa.charAt(0) == '3' && stringa.length() == 10)
            System.out.println("Numero di telefono valido");
        else
            System.out.println("Numero di telefono non valido");

        // controlla se un email e valida
        System.out.println("Inserisci un email: ");
        stringa = scanner.nextLine();


        if (stringa.indexOf("@") != -1) //restituisce l'indice della @
            System.out.println("Email valido");
        else
            System.out.println("Email non valido");

        // controlla se un url e valido
        System.out.println("Inserisci un url: ");
        stringa = scanner.nextLine();

        if (stringa.indexOf("http://") != -1)//restituisce l'indice di http
            System.out.println("url valido");
        else
            System.out.println("url non valido");

        // controlla se e un indirizzo ip valido
        System.out.println("inserisci un indirizzo ip: ");
        stringa = scanner.nextLine();

        String[] numeri = stringa.split("\\."); // crea un vettore e split divide dove c'è un punto
        int[] numeri2 = new int[numeri.length]; // crea un vettore di interi
        c = true;

        for (int i = 0; i < numeri.length; i++) 
        {
            numeri2[i] = Integer.parseInt(numeri[i]); // converte in intero
            if ((numeri2[i] > 255 && numeri2[1] < 0) || i > 3)
                c = false;
        }

        if (c)
            System.out.println("indirizzo ip valido");
        else
            System.out.println("indirizzo ip non valido");

        // controlla se un codice fiscale e valido
        System.out.println("Inserisci un codice fiscale: ");
        stringa = scanner.nextLine();

        String lettere = stringa.substring(0, 7) + stringa.substring(9, 10) + stringa.substring(12, 13) // prende le lettere  del codice fiscale e le mette in una stringa
                + stringa.substring(16);

        String num = stringa.substring(7, 9) + stringa.substring(10, 12) + stringa.substring(13, 16); // prende i numeri del codice fiscale e li mette in una stringa

        c = true;

        for (int i = 0; i < lettere.length(); i++)
            if (!Character.isLetter(lettere.charAt(i))) // controlla se sono lettere
            {
                c = false;
            }

        for (int i = 0; i < num.length(); i++)
            if (!Character.isDigit(num.charAt(i))) // controlla se sono numeri
            {
                c = false;
            }

        if (c && stringa.length() == 16)
            System.out.println("codice fiscale valido");
        else
            System.out.println("codice fiscale non valido");

        // controlla se un iban e valido

        System.out.println("Inserisci un iban: ");
        stringa = scanner.nextLine();

        c = true;

        if (stringa.length() != 27) // controlla la lunghezza
            c = false;
        if (stringa.substring(0, 3) != "IT") // controlla se inizia con IT
            c = false;

        if (c)
            System.out.println("iban valido");
        else
            System.out.println("iban non valido");

        // controlla se un codice ISBN-13 e valido
        System.out.println("Inserisci un codice ISBN-13: ");
        stringa = scanner.nextLine();

        c = true;

        for (int i = 0; i < stringa.length(); i++)
            if (!Character.isDigit(stringa.charAt(i))) // controlla se sono numeri
            {
                c = false;
            }

        if (c && stringa.length() == 13) // controlla la lunghezza
            System.out.println("codice ISBN-13 valido");
        else
            System.out.println("codice ISBN-13 non valido");

        scanner.close(); // chiude lo scanner
   }
}