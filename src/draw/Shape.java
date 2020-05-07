/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw;

import java.awt.Color;
import StdDraw.StdDraw;

/**
 *
 * @author aasim
 */
public abstract class Shape implements Moveable{
    double x;
    double y;
    Color color;
    Color Bg;
    
    public Shape(double x, double y, Color clr, Color cbg){
        this.x = x;
        this.y = y;
        this.color = clr;
        this.Bg = cbg;
    }
    
    public abstract void draw();
    public abstract void clear();
    public abstract void resize(double s);
    
    public void move(double newX, double newY){
        this.x = newX;
        this.y = newY;
    }

}
