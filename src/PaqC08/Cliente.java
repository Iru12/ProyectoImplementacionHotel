package PaqC08;

import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Cliente implements Serializable {
    private String Nombre;
    private String Apellido;
    private int DNI;
    private int telefono;
    private int numTarjeta;
    private int fechaE;
    private int fechaS;
    private String email;
    private int direccion;

    public Cliente(){
        Nombre = null;
        Apellido = null;
        DNI = 0;
        telefono = 0;
        numTarjeta = 0;
        fechaE = 0;
        fechaS = 0;
        email = null;
        direccion = 0;
    }

    public Cliente(String Nombre, String Apellido,int direccion, int DNI, int telefono,String email, int numTarjeta, int fechaE, int fechaS){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.direccion = direccion;
        this.DNI = DNI;
        this.telefono = telefono;
        this.email = email;
        this.numTarjeta = numTarjeta;
        this.fechaE = fechaE;
        this.fechaS = fechaS;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaE(int fechaE) {
        this.fechaE = fechaE;
    }

    public void setFechaS(int fechaS) {
        this.fechaS = fechaS;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public String getEmail() {
        return email;
    }

    public int getDireccion() {
        return direccion;
    }

    public int getFechaE() {
        return fechaE;
    }

    public int getFechaS() {
        return fechaS;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public int getTelefono() {
        return telefono;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return DNI == cliente.DNI && telefono == cliente.telefono && numTarjeta == cliente.numTarjeta && fechaE == cliente.fechaE && fechaS == cliente.fechaS && Objects.equals(Nombre, cliente.Nombre) && Objects.equals(Apellido, cliente.Apellido);
    }

}
