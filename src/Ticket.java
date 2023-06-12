import sun.util.calendar.BaseCalendar;

import java.util.ArrayList;
import java.util.Date;

import java.util.ArrayList;
import java.util.Date;

public class Ticket {
    private ArrayList<Producto> carrito;
    private Vendedor vendedor;
    private Cliente cliente;
    private String elPago;
    private Date fecha;
    private  int numeroTicket;

    public Ticket(Vendedor vendedor, Cliente cliente, String elPago, int numeroTicket) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.elPago = elPago;
        this.carrito = cliente.getCarrito();
        this.numeroTicket = numeroTicket;
    }

    public void setTicket(ArrayList<Producto> carrito) {
        this.carrito = carrito;
    }

    @Override
    public String toString() {
        String mostrarTicket = "------------Grupa K ------------";
        fecha = new Date();
        mostrarTicket = mostrarTicket + "\n" + "Tiket Numero: " + this.numeroTicket + "\n";
        mostrarTicket = mostrarTicket + "\n" + fecha.toString() + "\n";
        double montoTotal = 0;

        for (int i = 0; i < this.carrito.size(); i++) {
            mostrarTicket = mostrarTicket + this.carrito.get(i).getNombre();
            mostrarTicket = mostrarTicket + "   ";
            mostrarTicket = mostrarTicket + this.carrito.get(i).getStock();
            mostrarTicket = mostrarTicket + "   ";
            mostrarTicket = mostrarTicket + this.carrito.get(i).getPrecio();
            String precioParcial = String.format("%.2f",this.carrito.get(i).getPrecio() * this.carrito.get(i).getStock());
            mostrarTicket = mostrarTicket + "   " + precioParcial;
            mostrarTicket = mostrarTicket + "    ";
            montoTotal = montoTotal + this.carrito.get(i).getPrecio() * this.carrito.get(i).getStock();
            mostrarTicket = mostrarTicket + "\n";
        }

        mostrarTicket = mostrarTicket + "\n";
        mostrarTicket = mostrarTicket + "Total    " + "*****    " + String.format("%.2f",montoTotal) + "\n";
        mostrarTicket = mostrarTicket + "Cliente: " + this.cliente.getNombre() + "\n";
        mostrarTicket = mostrarTicket + "Vendedor: " + this.vendedor.getNombre() + "\n";
        mostrarTicket = mostrarTicket + "Gracias por su compra. \n";

        return mostrarTicket;
    }
}
