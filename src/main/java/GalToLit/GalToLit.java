package GalToLit;

public class GalToLit {

    private  String  name;
    private  double price;
    private  double gal;


    //  cosntructor

    public GalToLit(String name, double price, double gal) {
        this.name = name;
        this.price = price;
        this.gal = gal;
    }

    public  String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getGal() {
        return gal;
    }
}
