package model;

import java.util.Objects;

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
    private final int preIBAN = (int) (Math.random() * (99999999 + 1 - 10000000)) + 10000000;

    public Cuenta() {
        this.IBAN = "ES34"+preIBAN;
        this.titular = null;
        this.saldo = 0.0;
        this.activo = false;
    }

    public void setTitular(Cliente cliente) {
        if (Objects.isNull(this.titular)) {
            this.titular = cliente;
            this.activo = true;
        } else {
            System.out.println("La cuenta ya tiene duenyo.");
        }
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

    public boolean compareToIban(String iban) {
        return this.IBAN.equals(iban) ? true : false;
    }

    public Cliente getCliente() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getPIN() {
        return this.PIN;
    }
    
    public boolean compareToPin(int pin) {
        return this.PIN == pin ? true : false;
    }

    //Comprueba si el PIN introducido existe
    public boolean existPIN(int pin) {
        return this.PIN == pin ? true : false;
    }

}