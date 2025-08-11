package Collection;

import java.sql.SQLOutput;

public class CiclosColeccion {

    public static void main(String[] args) {
        String[] estudiantes  = { "carlos", "andres", "luis"};


        for(int iniciador= 0; iniciador< estudiantes.length; iniciador++ ) {
            System.out.println("Escaner de  elemetos  en  la  vuelta" + iniciador);
            for(String estudiante: estudiantes){
                System.out.println(estudiante);
            }
        }
        System.out.println("archivo  listo enviar  preparando envios");


    }
}
