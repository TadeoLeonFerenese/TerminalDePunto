import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Administrador elAdministrador;


        Scanner lectura = new Scanner( System.in);
        String opcion;
        String opcion2;

        boolean salirDelPrograma = false;

        while (salirDelPrograma==false){
            System.out.println(" Bienvenido al APP . TPV");
            System.out.println("\n");
            System.out.println("Favor ingresar una opcion.");
            System.out.println("1: Administrador. \n2: Vendedor\n3: Cliente");
            System.out.println("Seleccionar opcion: ");

            opcion = lectura.nextLine();

            if(opcion.equals("1")){

                System.out.println("");
                String nombre;
                String apellido;
                String dni;
                System.out.println("Ingrese el dni: ");
                dni = lectura.nextLine();
                System.out.println("Ingrese el nombre: ");
                nombre = lectura.nextLine();
                System.out.println("Ingrese el apellido: ");
                apellido = lectura.nextLine();

                elAdministrador = new Administrador(dni, nombre, apellido);
                System.out.println(elAdministrador);
            }
            else if(opcion.equals("2")) {
                System.out.println("Vendedor");

                System.out.println("Ingrese el nombre del vendedor:");
                String nombreVendedor = lectura.nextLine();

                System.out.println("Ingrese el apellido del vendedor:");
                String apellidoVendedor = lectura.nextLine();

                System.out.println("Ingrese la edad del vendedor:");
                String edadVendedor = lectura.nextLine();

                Vendedor vendedor = new Vendedor(nombreVendedor, apellidoVendedor, edadVendedor);

                System.out.println("Ingrese el DNI del cliente:");
                String dniCliente = lectura.nextLine();

                System.out.println("Ingrese el nombre del cliente:");
                String nombreCliente = lectura.nextLine();

                System.out.println("Ingrese el apellido del cliente:");
                String apellidoCliente = lectura.nextLine();

                Cliente cliente = new Cliente(dniCliente, nombreCliente, apellidoCliente);

                Transaccion t = new Transaccion(vendedor, new Stock());
                t.setCliente(cliente);
                t.armarStock();
                t.verder(cliente);
            }
            else if (opcion.equals("3")) {
                System.out.println("Cliente");

                System.out.println("Ingrese el DNI del cliente:");
                String dniCliente = lectura.nextLine();

                System.out.println("Ingrese el nombre del cliente:");
                String nombreCliente = lectura.nextLine();

                System.out.println("Ingrese el apellido del cliente:");
                String apellidoCliente = lectura.nextLine();

                Cliente cliente = new Cliente(dniCliente, nombreCliente, apellidoCliente);

                Transaccion t = new Transaccion(null, new Stock());
                System.out.println("Catálogo:");

                t.armarStock();
                t.verder(cliente);

            }

        }


        System.out.println("Quiere salir del sistema: s (Para salir),  n (Seguir)");
        opcion2 = lectura.next();
        if(opcion2.equals("s")){
            salirDelPrograma = true;

        }

    }
}
