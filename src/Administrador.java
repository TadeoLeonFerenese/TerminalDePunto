import java.util.Scanner;

public class Administrador extends Persona {
    public String sector = "Admin";
    private String clave;
    public static int idAdm = 0;
    private Scanner lectura = new Scanner( System.in);

    public Administrador(String dni, String nombre, String apellido){
        super(dni, nombre, apellido);
        definirClave();

    }
    private void definirClave(){
        System.out.println(" Ingresa una clave adm. :");
        this.clave = lectura.next();
   }
     @Override
    public String toString(){
        return "Administrador: " + super.getNombre() + "  " + super.getApellido() + " " + sector;

     }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
