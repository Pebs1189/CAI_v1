import model.Cajero;
import model.Cliente;
import model.Cuenta;

public class Cajero_Automatico_Inicial {
    public static void main(String[] args) throws Exception {
        Cajero cajero = new Cajero();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta();
        
        cajero.addClient(1, cliente1);
        cajero.addClient(2, cliente2);
        cajero.addAccount(1, cuenta1);
        cajero.addAccount(2, cuenta2);
    }
}