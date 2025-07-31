package Orders;
import  java.util.ArrayList;
import  java.util.List;
import  GalToLit.GalToLit;
import  ClientsOils.Clients;


public class Orders {
    private List<GalToLit> orders;
    private Clients client;


    public Orders( List<GalToLit> orders, Clients client) {
        this.orders = new ArrayList<>();
        this.client = client;

    }
    public double  calcularTotal(){
        return  orders.stream().mapToDouble(GalToLit::getPrice).sum();
    }
    public   List<GalToLit> getOrders() {
        return orders;
    }
    public  Clients getClient() {
        return client;
    }

}
