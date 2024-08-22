import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Concesionario WAutos");
        System.out.println("Seleccione el auto que desea:");
        System.out.println("1. Camaro");
        System.out.println("2. Mustang");
        System.out.println("3. Dondge");
        System.out.println("4. Porche");

        System.out.print("Ingrese el número de su elección: ");
        int opcion = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Ingrese su nombre: ");
        String nombreComprador = scanner.nextLine();


        double precioCamaro = 300000000;
        double precioMustang = 210000000;
        double precioDondge = 350000000;
        double precioPorche = 1900000000;
        double precioSeleccionado = 0;

        switch (opcion) {
            case 1:
                System.out.println("Ha seleccionado un Camaro. Precio: $" + precioCamaro);
                precioSeleccionado = precioCamaro;
                break;
            case 2:
                System.out.println("Ha seleccionado un Mustang. Precio: $" + precioMustang);
                precioSeleccionado = precioMustang;
                break;
            case 3:
                System.out.println("Ha seleccionado una Donge. Precio: $" + precioDondge);
                precioSeleccionado = precioDondge;
                break;
            case 4:
                System.out.println("Ha seleccionado un Porche. Precio: $" + precioPorche);
                precioSeleccionado = precioPorche;
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");

                scanner.close();
                return;
        }

        System.out.print("Ingrese el monto con el que desea comprar el auto: ");
        double montoCompra = scanner.nextDouble();


        if (montoCompra >= precioSeleccionado) {
            double cambio = montoCompra - precioSeleccionado;
            System.out.println("¡Felicidades " + nombreComprador + "! Ha comprado el auto.");
            System.out.println("Su cambio es: $" + cambio);
        } else {
            System.out.println("Lo siento " + nombreComprador + ", el monto ingresado no es suficiente para comprar el auto seleccionado.");
        }


    }
}