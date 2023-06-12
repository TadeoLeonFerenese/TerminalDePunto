public class Producto {
    private String  nombre;
    private int stock;
    private double precio;

    Producto(){

    }
    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        return  "Producto: " + this.nombre + " ***" + "Stock: " + this.stock +" " + this.getPrecio();
    }

    public void subirStock(){
        this.stock = this.stock + 1;

    }

    public void bajarStock(){
        this.stock = this.stock - 1;

    }
}
