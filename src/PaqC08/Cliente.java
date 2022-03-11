package PaqC08;

import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Cliente implements Serializable {
    private String Nombre;
    private String Apellido;
    private int DNI;
    private int telefono;
    private int numTarjeta;
    private int fechaE;
    private int fechaS;
    public Cliente(){
        Nombre = null;
        Apellido = null;
        DNI = 0;
        telefono = 0;
        numTarjeta = 0;
        fechaE = 0;
        fechaS = 0;
    }

    public Cliente(String Nombre, String Apellido, int DNI, int telefono, int numTarjeta, int fechaE, int fechaS){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.telefono = telefono;
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

    public void setDNI(int DNI) {
        this.DNI = DNI;
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

    public static Cliente ponDatos(){
        Scanner sc = new Scanner(System.in);
        Cliente c = new Cliente();
        System.out.print("Nombre: ");
        c.setNombre(sc.nextLine());
        System.out.print("Apellido: ");
        c.setApellido(sc.nextLine());
        System.out.print("DNI: ");
        c.setDNI(sc.nextInt());
        System.out.print("Telefono: ");
        c.setTelefono(sc.nextInt());
        System.out.print("Numero de Tarjeta: ");
        c.setNumTarjeta(sc.nextInt());
        System.out.print("Fecha de Entrada: ");
        c.setFechaE(sc.nextInt());
        System.out.print("Fecha de Salida: ");
        c.setFechaS(sc.nextInt());
        return c;
    }

}
