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
public class Circle extends Shape {
    private double radius;

    public Circle(double x, double y, Color clr, Color cbg) {
        super(x, y, clr, cbg);
    }
    
    public void draw(){
        StdDraw.setPenColor(super.color);
        StdDraw.circle(super.x, super.y, radius);
        StdDraw.show(100);

    }
    
    public void clear(){
        StdDraw.clear();
    }
    
    public void resize(double s){
        radius = radius * s; 
        if(super.x < 0)
            x += .05;
        else
            x -= .03;
        if(super.y > 1)
            y -= .05;
        else
            y += .03;
        
        move(x, y);
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
}
