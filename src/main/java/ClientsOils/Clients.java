package ClientsOils;

public class Clients {
    private String name;
    private  String correo;
    private String telefono;

    // Constructor
    public Clients(String name, String correo, String telefono) {
        this.name = name;
        this.correo = correo;
        this.telefono = telefono;
    }

    public  String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCorreo() {
        return correo;

    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
