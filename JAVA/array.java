import java.io.*;
public class array
{
public static void main(String args[]) throws NumberFormatException, IOException
{
    //somma1();
    //somma();
    //AdiK();
    massimo();
}

public static void somma1()throws NumberFormatException, IOException 
{
    int i=0;
    int v[]=new int[10];
    InputStreamReader In = new InputStreamReader(System.in);
    BufferedReader Tastiera = new BufferedReader(In);
    for (i=0; i<10; i++)
    {
    System.out.print("Valore: v["+i+"]= ");
    v[i]=Integer.parseInt(Tastiera.readLine());
    }
    for(i=0; i<10;i++)
    {
    System.out.println("v["+i+"]="+v[i]);
    }
    int S=0;
    for(i=0; i<10;i++)
    {
    S=S+v[i];
    }
    System.out.println("somma="+S);

}
public  static void somma()throws NumberFormatException, IOException 
{
    int x;
    InputStreamReader In = new InputStreamReader(System.in);
    BufferedReader Tastiera = new BufferedReader(In);
    do
    {
    System.out.print("Immettere un numero: ");
    x=Integer.parseInt(Tastiera.readLine());
    } while (x<=0);
    System.out.println("numero inserito: " + x);
    int i=0;
    int v[]=new int[x];
    for (i=0; i<x; i++)
    {
    System.out.print("Valore: ");
    v[i]=Integer.parseInt(Tastiera.readLine());
    }

    for(i=0; i<x;i++)
    {
    System.out.println("v["+i+"]="+v[i]);
    }
    int S=0;
    for(i=0; i<x;i++)
    {
    S=S+v[i];
    }
    System.out.println("somma="+S);
}


public static void AdiK() 
{
    double[] v = {2 ,3,-4,5,-6};

    int c=0,i=0;

    for(  i=0;i<v.length; i++)
    {
        if(v[i]<0)   c++;
    }

    System.out.println("numeri minori di 0= "+c);
}

public static void massimo()
{
    double[] v = {2 ,3,-4,5,-6};

    double max=v[0];

    for(int i=0;i<v.length;i++)
    {
        if(v[i]>max)
        {
            max=v[i];
        }
    }
    System.out.println("il massimo è "+ max);
}

}