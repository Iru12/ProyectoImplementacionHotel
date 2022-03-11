package PaqC08;

import java.io.Serializable;

public class Hotel implements Serializable {
    private Cliente[][] Habitaciones;

    public Hotel(){
        Habitaciones = new Cliente[6][5];
    }

    public void mapHab(){
        for(int i=0;i<6;i++){
            for(int j=0;j<5;j++){
                if(Habitaciones[i][j]==null){
                    System.out.print(" L ");
                }
                else{
                    System.out.print(" R ");
                }
            }
            System.out.println("");
        }
    }

    public void resHab(Cliente c, integer p, integer h){
        for(int i=5;i>=0;i--){
            for(int j=0;j<5;j++){
                if(Habitaciones[i][j]==null){
                    Habitaciones[i][j] = c;
                    p.setX(i);
                    h.setX(j+1);
                    if(p.getX()==5) p.setX(1);
                    else if(p.getX()==4) p.setX(2);
                    else if(p.getX()==3) p.setX(3);
                    else if(p.getX()==2) p.setX(4);
                    else if(p.getX()==1) p.setX(5);
                    else if(p.getX()==0) p.setX(6);
                    System.out.println("Has reservado una habitacion en la planta: " +p.getX()+ " Habitación: " +h.getX());
                    return;
                }
            }
        }
        System.out.println("No se ha podido realizar una reserva ya que nuestro hotel esta lleno. Sentimos las molestias.");
    }

    public void anularRes(Cliente c){
        for(int i=5;i>=0;i--){
            for(int j=0;j<5;j++){
                if(Habitaciones[i][j]==c){
                    Habitaciones[i][j] = null;
                    return;
                }
            }
        }
        System.out.println("No se ha encontrado ninguna reserva con esos datos");
    }
}
