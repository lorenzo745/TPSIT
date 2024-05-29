 // esercizio b  
import java.io.*;
import java.util.Scanner;

public class stringhe_B 
{

    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);//oggetto che legge la tastiera

        // legge stringa
        System.out.print("Inserisci una stringa: ");
        String stringa = scanner.nextLine(); // scanf

        // legge la seconda stringa
        System.out.print("Inserisci una stringa: ");
        String stringa2 = scanner.nextLine();

        // controlla se le stringhe sono uguali
        if (stringa.equalsIgnoreCase(stringa2))
            System.out.println("le stringhe sono uguali");
        else
            System.out.println("le stringhe non sono uguali");

        // legge un numero intero
        System.out.print("Inserisci un numero intero: ");
        stringa2 = scanner.nextLine();
        
        //trasforma la stringa in un intero
        int x = Integer.parseInt(stringa2);
        System.out.println("Il numero inserito è: " + x);

        // legge un numero con la virgola
        System.out.println("Inserisci un numero decimale: ");
        stringa2 = scanner.nextLine();

        //trasforma un numero intero in un numero con la virgola
        float y = Float.parseFloat(stringa2);
        System.out.println("Il numero inserito è: " + y);

        // legge una stringa e la riscrive una parola per riga
        System.out.println("inserisci una frase: ");
        stringa = scanner.nextLine();

        //crea un vettore di parole e ogni volta che c'è uno spazio divide
        String[] parole = stringa.split(" "); // split divide dove c'è uno spazio
        for (int i = 0; i < parole.length; i++)
        {
            System.out.println(parole[i]);
        }

        // legge una stringa e stampa i primi 5 caratteri
        System.out.println("inserisci una parola di almeno 6 caratteri: ");
        stringa = scanner.nextLine(); // legge la prossima stringa
        System.out.println(stringa.substring(0, 5));// substring crea una seconda stringa dal primo al quinto carattere e lo stampa

        // legge una stringa e ne stampa gli ultimi 5 caratteri
        System.out.println("inserisci una parola di almeno 6 caratteri: ");
        stringa = scanner.nextLine();
        System.out.println(stringa.substring(stringa.length() - 5)); // substring crea una seconda stringa 

        // legge una frase e stampa la parola piu lunga
        System.out.println("inserisci una frase: ");
        stringa = scanner.nextLine(); // legge la prossima stringa
        parole = stringa.split(" "); // split divide dove c'è uno spazio

        x = 0;

        for (int i = 0; i < parole.length; i++) 
        {
            if (parole[i].length() > parole[x].length()) //confronta la lunghezza delle parole
            {
                x = i;
            }
        }

        System.out.println("la parola piu lunga e: " + parole[x]);

        // legge una stringa e controlla se e una sigla
        System.out.println("inserisci una stringa: ");
        stringa = scanner.nextLine();
        boolean c = true; // variabile di controllo

        for (int i =1 ; i < stringa.length(); i += 2)
        {
            if (stringa.charAt(i) != '.') 
            {
                c = false;
            }
        }

        if (c) //se C è vero
            System.out.println("la stringa e una siglia");
        else
            System.out.println("la stringa non e una siglia");

        // legge due stringhe e controlla se sono anagrammi
        System.out.println("inserisci due parole: ");
        stringa = scanner.nextLine();
        stringa2 = scanner.nextLine();

        char[] lettere = stringa.toCharArray(); // crea un vettore di caratteri
        c = true;

        for (int i = 0; i < stringa2.length(); i++) 
            if (stringa2.indexOf(lettere[i]) == -1) // se trova la lettera nella stringa2 nn fa nulla
                c = false;

        if (c)
            System.out.println("le stringhe sono anagrammi");
        else
            System.out.println("le stringhe non sono anagrammi");

        scanner.close(); //chiude lo scanner
    }
}