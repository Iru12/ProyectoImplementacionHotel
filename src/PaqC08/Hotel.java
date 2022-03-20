package PaqC08;

import java.io.Serializable;

public class Hotel implements Serializable {
    private Cliente[][] Habitaciones;

    public Hotel(){
        Habitaciones = new Cliente[6][5];
    }

    public String mapHab(){
        String m = "";
        for(int i=0;i<6;i++){
            for(int j=0;j<5;j++){
                if(Habitaciones[i][j]==null){
                    m = m + " [L] ";
                }
                else{
                    m = m + " [R] ";
                }
            }
            m = m + "\n";
        }
        return m;
    }

    public boolean resHab(Cliente c,int contE, int contB, int contS){
        int contR = contE + contB + contS;
        if(contE>0) {
            for (int i = 5; i >= 0; i--) {
                for (int j = 0; j < 2; j++) {
                    if (Habitaciones[i][j] == null) {
                        Habitaciones[i][j] = c;
                        contE--;
                        contR--;
                    }
                    if(contE==0) break;
                }
                if(contE==0) break;
            }
        }
        if(contB>0){
            for (int i = 5; i >= 0; i--) {
                for (int j = 2; j < 4; j++) {
                    if (Habitaciones[i][j] == null) {
                        Habitaciones[i][j] = c;
                        contB--;
                        contR--;
                    }
                    if(contB==0) break;
                }
                if(contB==0) break;
            }
        }
        if(contS>0){
            for (int i = 5; i >= 0; i--) {
                for (int j = 4; j < 5; j++) {
                    if (Habitaciones[i][j] == null) {
                        Habitaciones[i][j] = c;
                        contS--;
                        contR--;
                    }
                    if(contS==0) break;
                }
                if(contS==0) break;
            }
        }
        return contR == 0;
    }

    public boolean anularRes(Cliente c, int contE, int contB, int contS){
        int contA = contE + contB + contS;
        if(contE>0) {
            for (int i = 5; i >= 0; i--) {
                for (int j = 0; j < 2; j++) {
                    if (Habitaciones[i][j] == c) {
                        Habitaciones[i][j] = null;
                        contE--;
                        contA--;
                    }
                    if(contE==0) break;
                }
                if(contE==0) break;
            }
        }
        if(contB>0) {
            for (int i = 5; i >= 0; i--) {
                for (int j = 2; j < 4; j++) {
                    if (Habitaciones[i][j] == c) {
                        Habitaciones[i][j] = null;
                        contB--;
                        contA--;
                    }
                    if(contB==0) break;
                }
                if(contB==0) break;
            }
        }
        if(contS>0) {
            for (int i = 5; i >= 0; i--) {
                for (int j = 4; j < 5; j++) {
                    if (Habitaciones[i][j] == c) {
                        Habitaciones[i][j] = null;
                        contS--;
                        contA--;
                    }
                    if(contS==0) break;
                }
                if(contS==0) break;
            }
        }
        return contA == 0;
    }
}
