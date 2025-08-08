package BookSystems;

public class Books {


    // ===== Atributos (estado del objeto) =====
    private String titulo;
    private String autor;
    private String categoria;
    private String estadoLibro; // Ej: "disponible", "prestado"
    private String codigoISBN;
    private String ubicacionSeccion;

    // ===== Constructor (crea objetos Libro) =====
    public Books(String titulo, String autor, String categoria, String estadoLibro, String codigoISBN, String ubicacionSeccion) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.estadoLibro = estadoLibro;
        this.codigoISBN = codigoISBN;
        this.ubicacionSeccion = ubicacionSeccion;
    }

    public  String getstatusLibro(){  //  retonar  el etsado  del  libro
        return estadoLibro;
    }
    public boolean validarDisponiblidad(){
        return  estadoLibro.equalsIgnoreCase("disponible");
    }

    public  void  marcarcomoPrestado( String libro){
        this.estadoLibro = libro;
    }


    public void mostrarInformacionGeneral() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoría: " + categoria);
        System.out.println("Estado: " + estadoLibro);
        System.out.println("ISBN: " + codigoISBN);
        System.out.println("Ubicación: " + ubicacionSeccion);
    }
}


/**

 public static void main(String[] args) {

 Books  Libro = new Books("fundamentos  de  programcion", "jorge villalobos", "ciencia de  la  computacion","Disponible","00AB751251-104", "ALA B");

 Libro.mostrarInformacionGeneral();

 String result = Libro.getstatusLibro();
 String NewEstado = "";
 System.out.println("EL  libro  esta  actualmente  marcado como" + " " +  result);
 displayregistros(Libro);

 if(Libro.getstatusLibro().equalsIgnoreCase("disponible")){
 System.out.println("Libro se encuentra  disponible  para  su  uso\n");
 }
 else{
 System.out.println("EL  estado  del  libro  a  sido modificado: ");
 System.out.println("Validado  estado  ultimo  estado");
 NewEstado = Libro.getstatusLibro();
 System.out.println("Nuevo  estado del  libro:  " + NewEstado);
 }
 }

 public  static void displayregistros(Books  Libro){
 if(!Libro.getstatusLibro().equalsIgnoreCase("Disponible")){
 System.out.println("NO SE  PUEDE PROCESAR UN NUEVO  REGISTRO");
 }
 else {
 System.out.println(" Iniciando  regitros nuevos  espere  porfavor");
 modificarRegistro(Libro);
 }

 }
 public   static  void  modificarRegistro(Books  Libro){
 Scanner sc = new Scanner(System.in);
 System.out.println("ingrese  porfavor  nuevo  estado  del  libro>>");
 String NewEntrada = sc.nextLine();
 if (NewEntrada.equalsIgnoreCase("Prestado")){
 Libro.marcarcomoPrestado(NewEntrada);
 System.out.println("Generado nuevo  estado..\n ........................");

 }
 else {
 System.out.println("Error  en  nuevo  registro  intente nuevamente");
 }

 sc.close();
 }
**/
