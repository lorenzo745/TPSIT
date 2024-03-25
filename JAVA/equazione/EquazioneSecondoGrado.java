import java.lang.Math;

public class EquazioneSecondoGrado {
    public static void main(String[] args)
    {

        if(args.length != 3) {
            System.out.println("Utilizzo per risolvere l'equazione ax^2 + bx + c = java [nome file] [a] [b] [c]");
            System.exit(0);
        }

        float[] parametri = new float[3];

        for (int i = 0; i < args.length; i++) {
            parametri[i] = Float.parseFloat(args[i]);
        }

        float[] soluzioni = CalcolaEquazione(parametri[0], parametri[1], parametri[2]);

        if(!Double.isNaN(soluzioni[0])) {
            
            if(soluzioni[0] != soluzioni[1]) {
                System.out.println("Soluzioni = " + soluzioni[0] + ", " + soluzioni[1]);
            }
            else {
                System.out.println("Unica Soluzione = " + soluzioni[0]);
            }
        }
        else {
            System.out.println("Nessuna Soluzione");
        }

        
    }

    public static float[] CalcolaEquazione(float a, float b, float c) {

        float delta = (float) Math.sqrt(b * b - 4 * a * c);

        if(delta> 0)
        {
        float x1 = (-1 * (b) + delta) / (2 * a); 
        float x2 = (-1 * (b) - delta) / (2 * a);

        float[] soluzioni = { x1, x2 };

        return soluzioni;
        }
        else if (delta == 0) {

            float x1 = (-1 * (b)) / (2 * a);

            float[] soluzioni = {x1, x1};

            return soluzioni;
        }
        else {

            float[] soluzioni = { Float.NaN, Float.NaN };

            return soluzioni;
        }
    }
}