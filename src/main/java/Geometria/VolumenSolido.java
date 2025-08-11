package Geometria;

public class VolumenSolido {




    public static void main(String[] args) {

        //  llamda  de  methodos

        int radioCono = 5;
        int alturaCono = 10;
        int  radioEsfera = 5;


        System.out.println("el  volumen  total  es:" + CalcularvolumenSolido(radioEsfera,radioCono,alturaCono));
        System.out.println("el   volumen Cono  es: " + calculavolumenCono(alturaCono, radioCono));
        System.out.println("el  volumne  Esfera" + calcularVolumenEsfera(radioEsfera));


    }


    static  double calculavolumenCono( int  altura , int  radio){
        double volumenCono;
        volumenCono =   (altura  * Math.PI * (radio * radio))/3;
        return volumenCono;
    }

    static  double calcularVolumenEsfera( int  radio){
        double volumenEsfera;
        volumenEsfera =  (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        return volumenEsfera;
    }

    static double  CalcularvolumenSolido(int  radioEsfera, int  radioCono, int  alturacono){

        double volumenSolido = calcularVolumenEsfera(radioEsfera) + calculavolumenCono(alturacono, radioCono);
        return volumenSolido;
    }
}
