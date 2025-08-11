package Maquina;
import java.util.ArrayList;
import java.util.Scanner;
public class Dispensadora {

    static   int  cambioCompra(int  valorProducto, int  dinero){
        int  cambio =  dinero - valorProducto;
        System.out.println("Su  cambio: ");
        return cambio;
    }

    public static void main(String[] args) {

        int  galletas;
        int  gaseosas;
        int  aguas;
        int mani;
        int  cigarrillos;
        int  dinero = 0;
        int opcion = 0;

        galletas = 3500;
        gaseosas = 1500;
        mani = 500;
        cigarrillos = 500;


        Scanner entrada = new Scanner(System.in);


        do{

            System.out.println("--------Maquina  deispensadora--------------");
            System.out.println("1. galletas");
            System.out.println("2. Gsseosa");
            System.out.println("3. aguas");
            System.out.println("4. mani");
            System.out.println("5. cigarrillos");
            System.out.println("0. Presione  [0] para  salir");
            System.out.println("\n ->>  seleccion el  producto a  comprar");
            opcion = entrada.nextInt();



            if(opcion != 0){
                System.out.println("ingrese  el dinero");
                dinero = entrada.nextInt();
            }

                switch (opcion) {
                    case 1:
                        System.out.println("compra  de  galletas ");
                        System.out.println(cambioCompra(galletas, mani));
                        break;
                    case 2:
                        System.out.println("compra de  gaseosa");
                        System.out.println(cambioCompra(gaseosas, mani));
                        break;
                    case 3:
                        System.out.println("compra  de  aguas ");
                        System.out.println(cambioCompra(galletas, mani));
                        break;
                    case 4:
                        System.out.println("compra  de mani");
                        System.out.println(cambioCompra(galletas, mani));
                        break;
                    case 5:
                        System.out.println("compra  de  cigarrillo");
                        System.out.println(cambioCompra(galletas, mani));
                        break;
                    case 0:
                        System.out.println("gracias  por tu  visita  feliz  dia");
                        System.out.println(cambioCompra(galletas, mani));
                        break;

                    default:
                        System.out.println("OPCION  INVALIDA.!!  INTENTE  NUEVAMENTE");
                }

                System.out.println("gracias  por  su  compra.!  ");

        }

        while(opcion != 0);

    }

}
