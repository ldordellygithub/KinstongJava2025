package Clonation;
import  java.util.Arrays;
public class CopyArrys {


    public static void main(String[] args) {

        //  creamos  un  arrasys  con valoes

        int[][] matriz = {
                {1,2,3},
                {4,5,6}
        };


        int [][]  DisplayMatrizCopia = copiarMatriz(matriz);

        matriz[0][0] = 99;  //  modifico  la  matriz

        System.out.println("mostrado  matriz origina:");
        mostrarMatriz(matriz);


        System.out.println("generado  copia  de  matriz  original\n");
        mostrarMatriz(DisplayMatrizCopia);


        boolean  resultMatriz = compararMatriz(matriz, DisplayMatrizCopia);

        System.out.println("el   resultado  de ambas  matrizes  si son iguales  es  de:"  + resultMatriz);


        mostrarMatriz(transponerMatriz(DisplayMatrizCopia));

    }

    static  int[][] copiarMatriz(int[][] matriz){

        int filaCopia = matriz.length;
        int columnCopia   = matriz[0].length;

        int [][]  MatrizCopiaOriginal = new int[filaCopia][columnCopia]; //  cremamos  la  matriz  nueva  con  lo valores  copiados

        for(int  fila = 0;   fila < matriz.length; fila ++){
            for(int columna = 0;  columna < matriz[fila].length; columna++){
                MatrizCopiaOriginal[fila][columna] = matriz[fila][columna];
            }
        }
        return MatrizCopiaOriginal;

    }


    static  void  mostrarMatriz(int[][] matriz){

        for(int  fila = 0;  fila < matriz.length; fila ++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + " ");

            }

            System.out.println();
        }
    }


    static  boolean  compararMatriz(int[][] Matriz_A, int[][] Matriz_B){
        //  verifamos  dimensiones

        if(Matriz_A.length != Matriz_B.length || Matriz_A[0].length != Matriz_B[0].length){
            return false;
        }


        //  recorremos  la matricez

        for(int  fila =0; fila < Matriz_A.length; fila ++){
            for(int  column =  0; column < Matriz_A[fila].length; column++){
                if(Matriz_A[fila][column] != Matriz_B[fila][column]){
                    return false;
                }
            }
        }

        return true;
    }


    static  int[][] transponerMatriz(int[][] matriz){
        //  refericamos  la  dimesiones  de  la matriz

        int  filas  = matriz.length;
        int  columns  =  matriz[0].length;


        int[][] transpuesta = new int[columns][filas];

        for(int fila= 0; fila < filas; fila ++ ){
            for(int columna= 0; columna < columns; columna ++ ){
                transpuesta[columna][fila] = matriz[fila][columna];
            }
        }
        return transpuesta;
    }

}
