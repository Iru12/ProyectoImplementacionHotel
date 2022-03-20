package PaqC08;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        integer planta = new integer(1);
        integer Hab = new integer(1);
        Cliente c1 = new Cliente("Paco","Gómez",6,1234,77,15,20);
        Hotel h1 = new Hotel();
        h1.mapHab();
        h1.resHab(c1,0,0,0);
        h1.anularRes(c1,0,0,0);
        System.out.println("Tras anular reserva: ");
        h1.mapHab();
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        fos = new FileOutputStream("Hotel.dat");
        salida = new ObjectOutputStream(fos);
        salida.writeObject(h1);
        fos.close();
        salida.close();
        FileInputStream fis = null;
        ObjectInputStream entrada = null;
        fis = new FileInputStream("Hotel.dat");
        entrada = new ObjectInputStream(fis);
        System.out.println("-------------------");
        h1 = (Hotel) entrada.readObject();
        fis.close();
        entrada.close();
        h1.mapHab();
    }
}