package Hospital;

public class Patients {

    private    String hospital;
    private   String nombre;
    private  String apellido;
    private int edad;
    private String historiaCLinica;


    public Patients(  String hospital,String nombre, String apellido, int edad) {
        this.hospital = hospital;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.historiaCLinica = "";
    }

    public String getHospital() {
        return hospital;
    }
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad <= 120){
            this.edad = edad;
        }
        else{
            System.out.println("no  se  puede  modifca  la edad ");
        }
    }

    public void registrarConsulta(String detalleConsulta) {
        String entradaConsulta = detalleConsulta;
        actualizarhistoriaCLinica(this.historiaCLinica + "\n" + entradaConsulta);

    }

    private void actualizarhistoriaCLinica(String historia){
        this.historiaCLinica = historia;
    }

    public String getResumenHistoriaCLinica() {
        return historiaCLinica;
    }

    @Override
    public String toString() {
        return  "nombre paciente:" + nombre + "\n" +
                "apellido  paciente:" + apellido +"\n" +
                "edad paciente:" + edad + "\n" +
                 "historia  clinica:" + getResumenHistoriaCLinica();
    }

}
/*+


        ArrayList<Patients> fichaPacientes = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        Patients p1 = new Patients("san vicente", "carlos", "medina ", 52);
        Patients p2 = new Patients("san vicente", "andrea", "salazar ", 33);
        Patients p3 = new Patients("san vicente", "Luis", " Lopez ", 25);
        Patients p4 = new Patients("san vicente", "Maria", "cardenas ", 41);

        fichaPacientes.add(p1);
        fichaPacientes.add(p2);
        fichaPacientes.add(p3);
        fichaPacientes.add(p4);

        //registrosConsulta(p1,entradaUsuario(sc));


        while(true){
            System.out.println("bienviendo  esperado miestra  carga  el sistema");
            System.out.println("escriba  el nombre  del  paciente  a  busca o  presione 'SALIR' para  cancela");
            String entrada  = sc.nextLine();


            if(entrada.equalsIgnoreCase("SALIR")){
                System.out.println("cerrando interacion");
                break;
            }

            Patients pacienteEncontrado = buscarPaciente(fichaPacientes, entrada);


            if(pacienteEncontrado != null){
                System.out.println("Desea  registra  una  nueva consulta del  paciente (si/no)");
                String consulta = sc.nextLine();

                if(consulta.equalsIgnoreCase("si")){
                    String nuevaConsulta = entradaUsuario(sc);
                    registrosConsulta(pacienteEncontrado,nuevaConsulta);
                    System.out.println("guardado  informacion  del  paciente..!!");
                    System.out.println("vovliendo  a panel  principal");
                }
            }
        }


    }
    public  static String  entradaUsuario(Scanner entrada){
        System.out.println("ingrese  los  detalles  de  la  consulta\n");
        return entrada.nextLine();
    }
    public   static void registrosConsulta(Patients paciente, String detalleConsylta){
        paciente.registrarConsulta(detalleConsylta);
    }


    public static void mostrarFichas(ArrayList<Patients> fichas) {
        System.out.println(" pacientes  en  el  sistema \n");
        for (Patients p : fichas) {
            System.out.println(p);
        }

        System.out.println("------------------------------");
    }

    public  static  Patients buscarPaciente(ArrayList<Patients> lista, String nombrePaciente){

        System.out.println("buscando  paciente ingresado  por  el oeperador");
        for (Patients p : lista) {
            if(p.getNombre().equalsIgnoreCase(nombrePaciente)){
                System.out.println("paciente encontrado\n");
                System.out.println(p);
                return p;
            }

        }
        System.out.println("paciente  no  encontrado");
        return  null;

    }

    public  static   String  menuOpciones(Scanner entrada){
        System.out.println("Que  accion desea   realizar..?");
        System.out.println("1. Modificar(NOMBRE)");
        System.out.println("2. Modifica(APELLIDO)");
        System.out.println("3. MODIFICAR(EDAD)");
        System.out.println("4. REGISTRAR NUEVA CONSULTA CLINICA");
        return  entrada.nextLine();
    }
 */