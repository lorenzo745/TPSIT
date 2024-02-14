public class Frazione {
    // Campi
    private int numeratore;
    private int denominatore;
    // Costruttore

    public static void main(String[] args)
    {
        int j,k;
        Frazione f1=new Frazione (5,10);
        Frazione f2=new Frazione (5,10);
        Frazione f3;

        j=f1.getDenominatore();
        System.out.println("Denominatore"+j);
        j=f1.getNumeratore();
        System.out.println("Numeratore"+j);
        f3=f1.somma(f2);
        System.out.println("f3"+f3);
        f1.semplifica();
        System.out.println("f1"+f1);
        f3=f1.moltiplica(f2);
        System.out.println("f3"+f3);
        f3=f1.sottrai(f2);
        System.out.println("f3"+f3);
        f3=f1.dividi(f2);
        System.out.println("f3"+f3);
    }

    public Frazione() {
        this.numeratore = 0;
        this.denominatore = 1;
    }

    public Frazione(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }
    
    public int getNumeratore() {
        return numeratore;
    }

    public int getDenominatore() {
        return denominatore;
    }
    
    @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }
    
    public Frazione somma(Frazione altraFrazione) {
        int nuovoNumeratore = this.numeratore * altraFrazione.denominatore
                + altraFrazione.numeratore * this.denominatore;
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;

        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

   
    private int calcolaMCD(int a, int b)
    {
        int z, r;
        if (a<b) {
            z = a;
            a = b;
            b = z;
        }


        do {
            r = a % b;
            if (r == 0) return b;
            a = b;
            b = r;
        } while(r!=0);

        return 0;
    }

    
    public void semplifica()
    {
        int mcd = calcolaMCD(this.numeratore, this.denominatore);
        if(mcd != 0)
        {
        this.numeratore /= mcd;
        this.denominatore /= mcd;
        }
    }

    
    public Frazione moltiplica(Frazione altraFrazione)
    {
        int nuovoNumeratore = this.numeratore * altraFrazione.numeratore;
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;
        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

    public Frazione sottrai(Frazione altraFrazione)
    {
        int nuovoNumeratore = this.numeratore * altraFrazione.denominatore - altraFrazione.numeratore * this.denominatore;
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;
        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

    
    public Frazione dividi(Frazione altraFrazione)
    {
        int nuovoNumeratore = this.numeratore * altraFrazione.denominatore;
        int nuovoDenominatore = this.denominatore * altraFrazione.numeratore;
        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }
}
