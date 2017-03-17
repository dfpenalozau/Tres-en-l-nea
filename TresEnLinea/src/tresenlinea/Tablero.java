package tresenlinea;

import javax.swing.JOptionPane;


public class Tablero {

public char[][]Ficha=new char[3][3];

public int Turno;

public int Variable;

public void CalcularTriqui(){
    if(Ficha[0][0]==Ficha[1][1]&&Ficha[1][1]==Ficha[2][2]&&Ficha[2][2]!=0){
        JOptionPane.showMessageDialog(null,"HAY GANADOR!");
        Variable=9;
    }
    if(Ficha[0][2]==Ficha[1][1]&&Ficha[1][1]==Ficha[2][0]&&Ficha[2][0]!=0){
        JOptionPane.showMessageDialog(null,"HAY GANADOR!");
        Variable=9;
    }
    if(Ficha[0][0]==Ficha[0][1]&&Ficha[0][1]==Ficha[0][2]&&Ficha[0][2]!=0){
        JOptionPane.showMessageDialog(null,"HAY GANADOR!");
        Variable=9;
    }
    if(Ficha[1][0]==Ficha[1][1]&&Ficha[1][1]==Ficha[1][2]&&Ficha[1][2]!=0){
        JOptionPane.showMessageDialog(null,"HAY GANADOR!");
        Variable=9;
    }
    if(Ficha[2][0]==Ficha[2][1]&&Ficha[2][1]==Ficha[2][2]&&Ficha[2][2]!=0){
        JOptionPane.showMessageDialog(null,"HAY GANADOR!");
        Variable=9;
    }
    if(Ficha[0][0]==Ficha[1][0]&&Ficha[1][0]==Ficha[2][0]&&Ficha[2][0]!=0){
        JOptionPane.showMessageDialog(null,"HAY GANADOR!");
        Variable=9;
    }
    if(Ficha[0][1]==Ficha[1][1]&&Ficha[1][1]==Ficha[2][1]&&Ficha[2][1]!=0){
        JOptionPane.showMessageDialog(null,"HAY GANADOR!");
        Variable=9;
    }
    if(Ficha[0][2]==Ficha[1][2]&&Ficha[2][2]==Ficha[2][2]&&Ficha[2][2]!=0){
        JOptionPane.showMessageDialog(null,"HAY GANADOR!");
        Variable=9; 
    }
    
}

}
