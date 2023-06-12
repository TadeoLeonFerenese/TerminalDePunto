import java.util.ArrayList;
public class Stock {

    private ArrayList<Producto> catalogo;


    public Stock(){
        this.catalogo = new ArrayList<Producto>();

    }

    public ArrayList<Producto> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Producto> catalogo) {
        this.catalogo = catalogo;
    }


    public void agregarItem( Producto p){
        this.catalogo.add(p);
    }

    public  Producto getProducto( int pos){
        return  this.catalogo.get(pos);
    }

    public  void borrarItem( Producto p){
        this.catalogo.remove(p);

    }

    @Override
    public  String toString() {
        String verCatalogo = "Listado del catalogo\n";
        verCatalogo = verCatalogo + "Producto  " + " Stock " + "Precio \n";

        for (int i = 0; i < this.catalogo.size(); i++) {
            verCatalogo = verCatalogo + this.catalogo.get(i).getNombre() + "    " + this.catalogo.get(i).getStock() + "    ";
            verCatalogo = verCatalogo + this.catalogo.get(i).getPrecio() + "\n";

        }
        verCatalogo = verCatalogo + "********************";
        return verCatalogo;
    }   
    public  int lengh(){
        return this.catalogo.size();
    }

    public boolean perteneceElProducto(Producto p){
        return  catalogo.contains(p);
    }
}
