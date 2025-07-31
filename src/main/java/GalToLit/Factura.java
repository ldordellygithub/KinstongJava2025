package GalToLit;
import Orders.Orders;


import java.util.List;


import java.util.stream.Collectors;

public class Factura {

    public void generarFactura(Orders orden){
        System.out.println("generando  factura de  compra");
        // creamos  un  for para recorrer los items de la orden
        List<String> items = orden.getOrders().stream()
                .map(item -> item.getName() + " - Precio: " + item.getPrice())
                .collect(Collectors.toList());
        // imprimimos los items
        items.forEach(System.out::println);
        System.out.println("Total a pagar: " + orden.calcularTotal());
    }
}
