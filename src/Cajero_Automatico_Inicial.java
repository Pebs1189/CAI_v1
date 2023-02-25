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

        
    }
}