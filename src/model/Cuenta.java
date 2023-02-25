package model;
 

public class Cuenta {
    //Numero identificador de la cuenta
    private String IBAN;
    //titular/res de la cuenta
    private Cliente titular;
    //saldo disponible en la cuenta
    private double saldo;
    //indicador de que la cuenta está activa
    private boolean activo;
    //indicador de que la cuente permite deber saldo al banco
    private boolean allowCredits;
    //PIN de la cuenta (única), se genera al crear la cuenta y no se cambia nunca.
    // Devuelve un número aleatorio entre dos valores 
    // (Math.random() * (<número_máximo + 1> - <número_mínimo>)) + <numero_mínimo>;
    private final int PIN = (int) (Math.random() * (9999 + 1 - 1000)) + 1000;

    public Cuenta() {
        this.IBAN = "";
        this.titular = null;
        this.saldo = 0.0;
        this.activo = false;
    }

    public void setIBAN(String iban){
        this.IBAN = iban;
    }

    public void setTitular(Cliente cliente) {
        this.titular = cliente;
    }

    public void setActiveAccount(boolean activo) {
        this.activo = activo;
    }

    public void addSaldo(double ingreso) {
        this.saldo += ingreso;
    }

    public void subSaldo(double restarSaldo) {
        this.saldo -= restarSaldo;
    }

    public boolean getAllowCredit() {
        return this.allowCredits;
    }

    public boolean getActiveAccount(){
        return this.activo;
    }

    public String getIBAN() {
        return this.IBAN;
    }

    public Cliente getClientes() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getPIN() {
        return this.PIN;
    }
    
}
