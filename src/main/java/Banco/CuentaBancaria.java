package Banco;

public class CuentaBancaria {

    private  String titular;
    private  String tipoCuenta;
    private  String numeroCuenta;
    private  double saldo;
    private  boolean  estadoCuenta;




    public CuentaBancaria(String titular, String tipoCuenta, String numeroCuenta, double saldo, boolean estadoCuenta) {
        this.titular = titular;
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.estadoCuenta = estadoCuenta;

    }



    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public boolean getEstadoCuenta() {
        return estadoCuenta;
    }
    public void setEstadoCuenta(boolean estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }


    public  void depositar(double monto){

        if(!estadoCuenta){
            System.out.println("operacion  rechazada  cuenta  inactiva");
            return;
        }
        if( monto >= 10.00 &&  monto <= 5000000){
            this.saldo +=  monto;
            System.out.println("Se  ha  realziado  un nuevo  deposito en  su  cuenta");
            System.out.println("Depósito realizado con éxito. Saldo actual: " + this.saldo);
        } else if (monto < 10.00) {
            System.out.println("Depósito rechazado. El monto mínimo es de 10.0");
        } else {
            System.out.println("Depósito rechazado. El monto máximo es de 5.000.000");
        }
    }
    public  void retirar(double cantidad){
        if(!estadoCuenta){
            System.out.println("Operacion rechasza  cuenta  inactiva");
            return;
        }
        if(cantidad >= 10.00 && cantidad<= saldo){
            this.saldo -= cantidad;
            System.out.println("Se  ha  relizado  un  retiro  de  su  cuenta ");
            System.out.println("Retiro  realizdo  con  exito. Saldo  actual:" + this.saldo);
        } else if (cantidad < 10.00) {
            System.out.println("Retiro  rechazado , solo  se permiten retiros mayores  a  10.00");
        }
        else{
            System.out.println("fondo  insuficientes");
        }
    }


    public  void  transferir(CuentaBancaria destino, double montotransferencia) {
        if (!estadoCuenta) {
            System.out.println("operacion rechazada  cuenta  inactiva");
            return;
        }

        if(!destino.getEstadoCuenta()){
            System.out.println("operacion rechazada  cuenta  de  destino  inactiva   ");
            return;
        }

        if(montotransferencia < 10.00){
            System.out.println("Monto  minimo  para  transferencia  debe  ser  mayores a  10.00");
            return;
        }
        if(montotransferencia > saldo){
            System.out.println("Saldo  insuficiente");
            return;
        }

        this.saldo -= montotransferencia;
        destino.depositar(montotransferencia);

        System.out.println("Transferencia realizada con éxito.");
        System.out.printf("Saldo actual cuenta origen: $%,.2f%n", this.saldo);

    }


    @Override
    public  String toString(){
                      return ("titular :" + titular + "\n" +
                            "estado  de  cuenta " + estadoCuenta + "\n"+
                             "numero  de cuenta " + numeroCuenta + "\n" +
                             "tipo de  cuenta "  +  tipoCuenta + "\n" +
                             "saldo  disponible " +   saldo + "\n");
    }
}
