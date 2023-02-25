package model;

import java.util.HashMap;
import java.util.Map;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String DNI;
    private int edad;
    private Map<Integer, Cuenta> cuentaPersonal;
    
    public Cliente() {
        this.nombre = "";
        this.apellidos = "";
        this.edad = -1;
        this.cuentaPersonal = new HashMap<Integer,Cuenta>(); 
    }

    public Cliente(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.cuentaPersonal = new HashMap<Integer,Cuenta>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCuenta(int id, Cuenta cuentaPersonal) {
        this.cuentaPersonal.put(id, cuentaPersonal);
    }

    public void setDNI(String dni){
        this.DNI = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public int getEdad(){
        return this.edad;
    }

    public Cuenta getCuenta(int id) {
        return this.cuentaPersonal.get(id);
    }

    public String getDNI() {
        return this.DNI;
    }

    public boolean isAdult() {
        return this.edad >= 18 ? true : false;
    }

    public boolean existAccount() {
        return this.cuentaPersonal.size() > 0 ? true : false;
    }
}