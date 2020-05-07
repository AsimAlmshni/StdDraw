/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draw;
import StdDraw.StdDraw;
import java.awt.Color;
/**
 *
 * @author aasim
 */
public class Square extends Shape{
    private double length;

    public Square(double x, double y, Color clr, Color cbg) {
        super(x, y, clr, cbg);
    }
    
    public void draw(){
        StdDraw.setPenColor(super.color);
        StdDraw.square(super.x, super.y, length);
        StdDraw.show(100);
    }
    
    public void clear(){
        StdDraw.clear();
    }
    
    public void resize(double s){
        length = length * s; 
        if(super.x > 0)
            x-=.05;
        else
            x += .03;
        if(super.y < 1)
            y+=.05;
        else
            y -= .03;
        
        move(x, y);
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
}
