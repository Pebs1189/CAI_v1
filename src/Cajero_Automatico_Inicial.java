import java.util.Scanner;

import model.Cajero;
import model.Cliente;
import model.Cuenta;

public class Cajero_Automatico_Inicial {
    public static void main(String[] args) throws Exception {
        //Creamos el cliente
        Cliente arturo = new Cliente("Arturo","Garcia",25, "X234233X"); 
        System.out.println("Se crea la cuenta de Artura Garcia.");

        //Creamos la cuenta
        Cuenta arturoAccount = new Cuenta();
        System.out.println("La cuenta de Arturo garcia tiene el IBAN: "+arturoAccount.getIBAN());

        //Anyadimos el cliente a la cuenta
        arturoAccount.setTitular(arturo);
        //activamos la cuenta del cliente
        arturoAccount.setActiveAccount(true);

        //Añadimos la cuenta al cliente.
        arturo.setCuenta(1, arturoAccount);

        //creamos cajero y anyadimos las cuentas y sus clientes
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
                    System.out.println("Login PABS Bank");
                    System.out.println("Introduce el IBAN de la cuenta: ");
                    //TODO
                    //Corregir esto, para que se lea primero el iban y luego el pin por teclado.
                    String IBAN = tecl.nextLine();
                    System.out.println("Introduce el PIN");
                    int PIN = tecl.nextInt(); 

                    /*
                     * Validar que el IBAN y el PIN es correcto, en ése orden.
                     */
                    //TODO
                    //Code a implementar:
                    //Comprobamos con el cajero si existe una cuenta con el IBAN leido
                    //Comprobamos si el PIN de la cuenta es correcta
                    //Si alguno de los resultados no es correcto, informamos de cual es erroneo y salimos del case (break).
                    
                    //declaramos variables de apoyo.
                    int menu_cuenta = -1;

                    //si todo ha ido bien la variable result sera igual a true
                    while(menu_cuenta!=4) {
                        System.out.println("Bienvenido a PABS Bank");
                        System.out.println("1. Consultar Saldo");
                        System.out.println("2. Sacar dinero");
                        System.out.println("3. Ingresar dinero");
                        System.out.println("4. Atras");
                        System.out.println("Elija la operacion a realizar...");

                        //leemos el valor por teclado.
                        menu_cuenta = tecl.nextInt();

                        switch (menu_cuenta) {
                            case 1:
                                //TODO
                                //Code a implementar
                                break;
                            case 2:
                                //TODO
                                //Code a implementar
                                break;
                            case 3:
                                //TODO
                                //Code a implementar
                                break;
                            case 4:
                                System.out.println("");
                                break;
                            default:
                                //TODO
                                //Code a implementar
                                break;
                        }
                    }
                    

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
        };       
    }
}