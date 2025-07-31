package GalToLit;
import Orders.Orders;
public class Message {

public void printMessage( Orders orden){
    System.out.println("enviando factura de  compra al  correo: " + orden.getClient().getCorreo() + " Nombre del cliente" +  orden.getClient().getName() +"\n" );

}
}
