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
public class Draw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StdDraw.setCanvasSize(600, 600);
        
        Circle cl = new Circle(0.9, 0.5, Color.BLUE, Color.lightGray);
        cl.setRadius(0.165);
        
        Square sq1 = new Square(0.2, 0.5, Color.BLACK, Color.GRAY);
        sq1.setLength(0.165);
        
        Square sq2 = new Square(0.3, 0.9, Color.RED, Color.ORANGE);
        sq2.setLength(0.165);
        
        
        while(true){
            cl.draw();
            sq1.draw();
            sq2.draw();
//            cl.clear();
            cl.resize(.991);
            sq1.resize(0.971);
            sq2.resize(0.981);
        }
    }
    
}
