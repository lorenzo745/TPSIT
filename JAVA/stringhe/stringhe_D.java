 // esercizio d
import java.io.*;
import java.util.Scanner;

public class stringhe_D 
{
    public static void main(String[] args) 
    { 
        Scanner scanner = new Scanner(System.in); //oggetto che legge la tastiera
        System.out.println("Inserisci una frase: ");

        String stringa = scanner.nextLine(); // legge la frase
        String stringa2 = stringa;

        String[] parole = stringa2.split(" "); // crea un vettore con le parole della frase

        // Kebab-case
        stringa2 = String.join("-", parole); // unisce le parole con un -
        System.out.println("Kebab-Case: " + stringa2);

        stringa2 = stringa;

        // Snake_Case
        stringa2 = String.join("_", parole); // unisce le parole con un _
        System.out.println("Snake_Case: " + stringa2);

        stringa2 = stringa; // ripristina la stringa

        //camelCase
        for (int i = 1; i < parole.length; i++) 
        {
            parole[i] = parole[i].substring(0, 1).toUpperCase() + parole[i].substring(1); // mette la prima lettera maiuscola
        }

        stringa2 = String.join("", parole); // unisce le parole
        System.out.println("camelCase: " + stringa2);

        stringa2 = stringa;

        //PascalCase

        for (int i = 0; i < parole.length; i++) 
        {
            parole[i] = parole[i].substring(0, 1).toUpperCase() + parole[i].substring(1); // mette la prima lettera maiuscola
        }

        stringa2 = String.join("", parole);// unisce le parole
        System.out.println("PascalCase: " + stringa2);

    }
}