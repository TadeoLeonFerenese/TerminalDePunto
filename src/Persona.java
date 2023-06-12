public class Persona {
    private String dni;
    private String  nombre;
    private String apellido;

    private int id;

    private static int siguiente= 1;

    public void setId() {
        this.id = siguiente;
        siguiente++;
    }

    public Persona(String dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.setId();


    }

    @Override
    public  String toString(){
        return  "Se llama " + nombre + ' ' + apellido;
    }
    public String getNombre(){ return this.nombre;}
    public String getDni(){ return  this.dni; }
    public String getApellido() { return  this.apellido;}


}