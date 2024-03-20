public class Frazione {
    // Campi
    private int numeratore;
    private int denominatore;
    // Costruttore

    public static void main(String[] args)
    {

        if(args.length % 2 != 0 || args.length == 0) {
            System.out.println("Utilizzo: java [nome file] [numeratore 1] [denominatore 1] [numeratore 2] [denominatore 2] ...");
            System.exit(0);
        }

        int[] parametri = new int[args.length];
        Frazione[] frazioni = new Frazione[args.length/2];

        for(int i = 0, j=0; j<args.length; i+=1, j+=2) {
            parametri[j] = Integer.parseInt(args[j]);
            parametri[j+1] = Integer.parseInt(args[j+1]);
            frazioni[i] = new Frazione(parametri[j], parametri[j+1]);
        }

        for(int i = 0; i<frazioni.length; i++) {
            System.out.println("Frazione f" + (i) + " = " + frazioni[i]);
        }

        
    }

    public Frazione() {
        this.numeratore = 0;
        this.denominatore = 1;
    }

    public Frazione(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
        this.semplifica();
    }
    // Metodo per ottenere il numeratore
    public int getNumeratore() {
        return numeratore;
    }
// Metodo per ottenere il denominatore
    public int getDenominatore() {
        return denominatore;
    }
    // Metodo per ottenere la rappresentazione testuale della frazione
    @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }
    // Metodo per sommare due frazioni
    public Frazione somma(Frazione altraFrazione) {
        int nuovoNumeratore = this.numeratore * altraFrazione.denominatore
                + altraFrazione.numeratore * this.denominatore;
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;

        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

    // Metodo per calcolare il Massimo Comune Divisore (MCD) con l'algoritmo di Euclide
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

    // Metodo per semplificare la frazione
    public void semplifica()
    {
        int mcd = calcolaMCD(this.numeratore, this.denominatore);
        if(mcd != 0)
        {
        this.numeratore /= mcd;
        this.denominatore /= mcd;
        }
    }

    // Metodo per moltipicare la frazione
    public Frazione moltiplica(Frazione altraFrazione)
    {
        int nuovoNumeratore = this.numeratore * altraFrazione.numeratore;
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;
        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

    // Metodo per sottrarre due frazioni
    public Frazione sottrai(Frazione altraFrazione)
    {
        int nuovoNumeratore = this.numeratore * altraFrazione.denominatore - altraFrazione.numeratore * this.denominatore;
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;
        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

    // Metodo per dividere due frazioni
    public Frazione dividi(Frazione altraFrazione)
    {
        int nuovoNumeratore = this.numeratore * altraFrazione.denominatore;
        int nuovoDenominatore = this.denominatore * altraFrazione.numeratore;
        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }
}