import javax.xml.crypto.Data;
import java.sql.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class Cliente extends Persona{
    /*
    *   contacto:  guarda la infomacion de contacto con el cliente
    *   idCliente: es para identifica que la persona es unica
    *   carrito:   es la compra del cliente, una lista de productos.
    *
    *  */

    private String contacto ;
    private int idCliente;
    private  ArrayList<Producto> carrito ;

    private Scanner lectura = new Scanner( System.in);

    public Cliente(String dni, String nombre, String apellido) {

        super(dni, nombre, apellido);
        this.carrito = new ArrayList<Producto>();
    }

    @Override
    public String toString(){
        return "cliente: " + super.getApellido() + " " + super.getNombre() + " " + super.getDni();
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(){
        System.out.println("Ingresar un contacto: ");
        this.contacto = lectura.next();

    }

    /* Genero una copia del producto para el cliente */
    public void agregarProducto(Producto p) {
        Producto productoComprado = new Producto();
        productoComprado.setNombre(p.getNombre());
        productoComprado.setPrecio(p.getPrecio());
    
        System.out.print("Ingrese la cantidad solicitada: ");
        int cantidadSolicitada = lectura.nextInt();
        productoComprado.setStock(cantidadSolicitada);
    
        this.carrito.add(productoComprado);
    }
    

    

    /*
    public void addProducto( Producto p){
        int n = 0;
        System.out.print("Ingrese un cantidad menor a :");
        System.out.printf("%f", p.getStock());
        Scanner lectura = new Scanner(System.in);
        String cantidadSolicitada = lectura.next();
        ArrayList<String> item = new ArrayList<String>();
        item.add( p.getNombre());
        item.add( String.valueOf(p.getPrecio()));
        item.add( cantidadSolicitada);
        this.carrito.add(item);
        }
      */
    public void vaciarCarrito(){
        this.carrito.clear();
        }

    public ArrayList<Producto> getCarrito() {
        return this.carrito;
    }

    public void setCarrito(ArrayList<Producto> carrito) {
        this.carrito = carrito;
    }
}
