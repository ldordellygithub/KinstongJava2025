package Cars;

public class Car {
    String marca = "chevorlet";
    String color = "negro";
    int velocidad = 0;
    boolean encendido = false;


    public void mostrarInfo() {
        // Aquí debe ir el código para imprimir la marca, color y velocidad
        System.out.println("marca:" + marca);
        System.out.println("color:" + color);
        System.out.println("velocidad  inicial" + " " + velocidad);

    }


    public void acelerar(int incremento) {
        System.out.println("aumentando  velocidad ");
        velocidad += incremento;
        System.out.println("velocidad  alcanzada:" + velocidad + "Km..");
    }

    public void frenar(int freno) {
        System.out.println("Frenando...");
        velocidad -= freno;

        if (velocidad > 0) {
            System.out.println("Aún en movimiento, frenado parcial.");
        } else if (velocidad == 0) {
            System.out.println("Auto detenido en su totalidad.");
        } else { // velocidad < 0
            velocidad = 0;
            System.out.println("Frenaste más de lo necesario, auto detenido.");
        }

        System.out.println("Velocidad actual: " + velocidad + " km/h");
    }

    public boolean encendido(boolean motorOn) {
        if (motorOn) {
            encendido = true;
            System.out.println("motor  en marcha");
        }
        return encendido;
    }

    public boolean apagado() {
        encendido = false;
        System.out.println("apagando  motor");
        return encendido;
    }
}

/**   Car auto01 = new Car();
 Boolean BateriaCargada = true;
 String EstadoUsuario = "activo";


 if(EstadoUsuario.equalsIgnoreCase("activo")){
 auto01.encendido(BateriaCargada);
 auto01.acelerar(35);
 auto01.acelerar(35);
 auto01.acelerar(35);
 auto01.frenar(35);
 }
 else{
 auto01.mostrarInfo();
 }

 */