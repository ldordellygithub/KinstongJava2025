package Logistic;
import   javax.swing.JOptionPane;
public class Condicionales {

    static String nombreUsuario = "luis";
    static int  contraseña  = 202310;
    static  String interfaz =  "facebook";


     public static void main(String[] args) {

         String usuario;
         int contraseña;
         String  inicio ="facebook";
         boolean conexion = true;


         usuario =  JOptionPane.showInputDialog("Ingrese el nombre del usuario");
         contraseña = Integer.parseInt(JOptionPane.showInputDialog("ingrese  contraseña"));

         validacionUser(usuario,contraseña,inicio,conexion );
    }



    static   boolean  Authentication(String user,  int Password){
        if (nombreUsuario.equals(user) && contraseña == Password) {
            return true;
        }
       return false;
    }

    static   void validacionUser(String dato1, int dato2, String inicioApp, boolean conexion){
         boolean auth =  Authentication(dato1, dato2);
         boolean systemok = SystemApp(inicioApp,conexion);

         if(auth && systemok){
             JOptionPane.showMessageDialog(null,"welcome user");
         }
         else if(!auth){
             JOptionPane.showMessageDialog(null,"invalid user or  password");
         }
         else{
             statusSystem(conexion);
             JOptionPane.showMessageDialog(null,"error en  la  red intente  despues");
         }
    }

    static  boolean SystemApp(String  inicio,  Boolean  redactiva){
          return interfaz.equals(inicio) && redactiva;
    }

    static   boolean  statusSystem(boolean  redActiva){
         return redActiva;
    }
}
