public class Persona {

    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }
    public  void  mostrarNombre(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellidoPaterno = " + apellidoPaterno);
        System.out.println("apellidoMaterno = " + apellidoMaterno);
    }
}
