package model;

public class Cuenta {
    private String IBAN;
    private Cliente titular;
    private double saldo;
    private boolean activo;

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

    public void addSaldo(double ingreso) {
        this.saldo += ingreso;
    }

    public void subSaldo(double restarSaldo) {
        this.saldo -= restarSaldo;
    }
    
}
