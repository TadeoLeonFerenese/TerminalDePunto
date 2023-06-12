
 import java.util.Scanner;

    public class Transaccion {
        private Cliente cliente;
        private Vendedor vendedor;
        private Stock stock;
        private Ticket ticket;
        private  int idTicket;
        private  static int siguienteId = 1;
        private Scanner lectura = new Scanner( System.in);

        public Transaccion(Vendedor vendedor, Stock stock) {

            this.vendedor = vendedor;
            this.stock = stock;
        }

        public void setId(){
            this.idTicket = siguienteId;
            siguienteId++;
        }
        public  void setCliente(Cliente cliente){
            this.cliente = cliente;
        }

        /* Agrega un prodcuto al carrito del clientes */

        public void agregarAlcarrito(Producto p) {
            this.cliente.agregarProducto( p );

        }


        /* Vender el cliente selecciona un producto del stock */
        public void verder(Cliente cliente){
            System.out.println("Ver el catalogo.\n");
            System.out.println(this.stock.toString());
            System.out.println("Bienvenido " + this.cliente.getNombre()+ ".\n");

            System.out.print("Selccionar un producto. Ingresar un valor menor a: ");
            System.out.println( this.stock.lengh());

            int pos = lectura.nextInt();
            this.agregarAlcarrito(this.stock.getProducto(pos));

            this.confirmarVenta();
        }

        /* Confirma la venta del clientes */

        private void confirmarVenta() {
            System.out.print("Desea confirmar la venta, ingrese\n");
            System.out.println("s : Si       n:No          a: Agregar otro producto");
            String ingreso = lectura.next();
            String medioDePago ="Debito";
            if (ingreso.equals("s")){

                this.setId();

                this.ticket = new Ticket(this.vendedor, this.cliente, medioDePago, this.idTicket);

                System.out.println(ticket.toString());
            } else if (ingreso.equals("n")) {
                System.out.println("No se conreto la venta");

            }else{
                this.verder(this.cliente);
            }

        }

        public String mostrarTicket(){
            return this.ticket.toString();
        }

        public  void armarStock(){
            Producto p1 = new Producto();
            p1.setNombre("Campera");
            p1.setPrecio(25.30);
            p1.setStock(10);

            Producto p2 = new Producto();
            p2.setNombre("Remera");
            p2.setPrecio(20.0);
            p2.setStock(20);

            Producto p3 = new Producto();
            p3.setNombre("Media");
            p3.setPrecio(5.3);
            p3.setStock(30);

            this.stock.agregarItem(p1);
            this.stock.agregarItem(p2);
            this.stock.agregarItem(p3);

        }
    }



