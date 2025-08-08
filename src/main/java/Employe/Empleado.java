package Employe;

public class Empleado {
    String Nombre;
    double Salario;
    String  Cargo;
    String  Dni;


    public Empleado(String Nombre, double Salario, String Cargo, String Dni) {
        this.Nombre = Nombre;
        this.Salario = Salario;
        this.Cargo = Cargo;
        this.Dni = Dni;
    }

    public  void  saludar(){
        System.out.println("hola  soy " + Nombre +  "me alegra  verte");
        System.out.println("actualmente  trabajo  como" + Cargo);
    }

    public  double calcularSalario(){
        return Salario;
    }

    public double  comisiones( double porcentaje){
        return Salario * (porcentaje/100);
    }

    public  double salarioTotal(double comision){
        return Salario + comision;
    }
}
