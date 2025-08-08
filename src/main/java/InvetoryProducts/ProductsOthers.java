package InvetoryProducts;

public class ProductsOthers {
    private  String  name;
    private  String marca;
    private  double  price;
    private  int    stock;


   public  ProductsOthers(String name, String marca, double price, int stock) {
        this.name = name;
        this.marca = marca;
        this.price = price;
        this.stock = stock;
    }


    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getMarca() {
        return marca;
    }

    public  int getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + "Marca:" + marca + " " + "Price:" + price + " " + "Stock:" + stock;
    }
}

/**
public static void main(String[] args) {

    //  creamos  una matriz  3 * 4  3  objetos  cada  uno  uno  con 4 caracteristicas

    ProductsOthers[][] inventarioMatriz = new ProductsOthers [2][4];

    inventarioMatriz[0][0]= new ProductsOthers("Telefono movil", "Samsung", 750.35, 100);
    inventarioMatriz[0][1]= new ProductsOthers("Camara  professional", "Cannon", 1500.88,50);
    inventarioMatriz[0][2] = new ProductsOthers("Computador portatil", "Lenovo", 850.40, 150);
    inventarioMatriz[0][3] = new ProductsOthers("Television UHD", "Sony", 1255.40,100);

    //  ahora la  segunda  fila
    inventarioMatriz[1][0] = new ProductsOthers("Disco duro", "Kistong", 85.10,45);
    inventarioMatriz[1][1] = new ProductsOthers("Cable  usb", "universal", 12.10, 250);
    inventarioMatriz[1][2] = new ProductsOthers("memoria usb 32gb","remingthon", 35.00,100);
    inventarioMatriz[1][3] = new ProductsOthers("Mouse sencillo", "universal", 25.10,35);

    displayMatriz(inventarioMatriz);

}


static  void  displayMatriz(ProductsOthers[][] matriz){
    for (int  fila = 0; fila < matriz.length; fila++) {
        for(int column = 0; column < matriz[fila].length; column++){
            System.out.println("[" + fila + "][" + column + "]: " + matriz[fila][column]);
        }
    }
}
*/