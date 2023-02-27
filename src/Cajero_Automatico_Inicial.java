import java.util.Scanner;

import model.Cajero;
import model.Cliente;
import model.Cuenta;

public class Cajero_Automatico_Inicial {
    public static void main(String[] args) throws Exception {
        //Creamos el cliente
        Cliente arturo = new Cliente("Arturo","Garcia",25); 
        //Creamos la cuenta
        Cuenta arturoAccount = new Cuenta();
        //Añadimos la cuenta al cliente.
        arturo.setCuenta(1, arturoAccount);
        //Añadimos el cliente a la cuenta
        arturoAccount.setTitular(arturo);

        Cajero cajero = new Cajero();
        cajero.addAccount(1, arturoAccount);
        cajero.addClient(1,  arturo);

        //Declaramos el scanner para poder leer desde teclado
        Scanner tecl = new Scanner(System.in);
        //Variable para seleccionar el menu de opciones
        int menu = -1;

        //Bucle para el menú de opciones
        while (menu != 2) {
            System.out.println("Bienvenido a PABS Bank");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.println("Inicie sesion para realizar cualquier tramite...");

            //Lectura del teclado
            menu = tecl.nextInt();

            //opciones del menu
            switch (menu) {
                case 1:
                    System.out.println("Introduce el IBAN de la cuenta: ");
                    String IBAN = tecl.nextLine();
                    System.out.println("Introduce el PIN");
                    int PIN = tecl.nextInt(); 

                    /*
                     * Validar que el IBAN y el PIN es correcto, en ése orden.
                     */
                    //TODO
                    break;
                case 2:
                    System.out.println("Gracias! vuelva pronto.");
                     //cerramos el scanner
                    tecl.close();
                    break;
                default:
                    System.out.println("Introduzca un valor correcto.");
                    break;
            }

            System.out.println("");
            System.out.println("");
        };       
    }
}