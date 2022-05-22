/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author lenon
 */
public class Raqueta {
    private int x,y;
    static final int ANCHO=10,ALTO=80;
    
    
    public Raqueta (int x,int y){
        this.x=x;
        this.y=y;
    }
    
    public Rectangle2D getRaqueta(){
        return new Rectangle2D.Double(x,y,ANCHO,ALTO);
    }
    
    public void moverR1(Rectangle limites){
        if (EventoTeclado.w==true && y > limites.getMinY()) {
            y--;
        }
        if (EventoTeclado.s==true && y < limites.getMaxY()-ALTO) {
            y++;
        }
    }
    public void moverR2(Rectangle limites){
        if (EventoTeclado.up==true && y > limites.getMinY()) {
            y--;
        }
        if (EventoTeclado.down==true && y < limites.getMaxY()-ALTO) {
            y++;
        }
    }
    
    
}
