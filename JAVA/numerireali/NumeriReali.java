public class NumeriReali {

    public static void main(String[] args){
        
        float[] parametri = new float[args.length];

        for(int i = 0; i<args.length; i++){
            parametri[i] = Float.parseFloat(args[i]);
        }

        float somma = 0;
        for(int i = 0; i<args.length; i++){
            somma += parametri[i];
        }

        System.out.println("la somma di tutti i numeri è " + somma);

        float media = (parametri[0] + parametri[1] + parametri[2])/3;

        System.out.println("la media di tutti i numeri è " + media);

        float max = parametri[0];
        float min = parametri[0];

        for(int i = 1; i<parametri.length; i++) {
            if(max< parametri[i]) max = parametri[i];
            if(min> parametri[i]) min = parametri[i];
        }

        System.out.println("il massimo dei numeri è " + max);
        System.out.println("il minimo dei numeri è " + min);


    }


}