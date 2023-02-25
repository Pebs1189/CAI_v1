package model;

import java.util.HashMap;
import java.util.Map;

public class Cajero {
    private Map<Integer, Cliente> clientList;
    private Map<Integer, Cuenta> accountList;

    public Cajero() {
        clientList = new HashMap<>();
        accountList = new HashMap<>();
    }

    public void addClient(int id, Cliente client) {
        clientList.put(id, client);
    } 

    public void removeClient(int idClient) {
        clientList.remove(idClient);
    }

    public Cliente getCliente(int id) {
        return clientList.get(id);
    }

    public void addAccount(int id, Cuenta account) {
        accountList.put(id, account);
    } 

    public void removeAccount(int id) {
        accountList.remove(id);
    }

    public Cuenta getAccount(int id) {
        return accountList.get(id);
    }
}