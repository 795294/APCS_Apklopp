
/**
 * Write a description of class MyPicture here.
 *
 * @author (Peter Klopp)
 * @version (8/28)
 */

import java.awt.*;
public class MyPicture
{
    
    public static void main(){
        int size, turn;
        
        Turtle turtle = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        
        Turtle turtle2 = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        
        Turtle turtle3 = new Turtle(Turtle.NO_DEFAULT_WINDOW);
        
        TurtleDrawingWindow window = new TurtleDrawingWindow();
        
        
        
        window.add(turtle);
        
        window.add(turtle2);
        
        window.setVisible(true);
        
        window.setUnit(1);
        
        //window.setOrigin(500,500);
        turtle.jumpTo(-100,-100);
        
        turtle.heading(0);
        
        size = 100;
        
        turn = 55;
         
        turtle.penColor(Color.red);
        
        turtle.penSize(1);
        
        
        turtle2.jumpTo(100,100);
        
        turtle2.heading(0);
        
        size = 200;
        
        turn = 125;
         
        turtle2.penColor(Color.blue);
        
        turtle2.penSize(3);
        
        for(int i = 0; i < 500; i++){
           turtle.move(size); 
           turtle.turn(turn); 
           
           for(int j = 0; j < 12; j++){
               
               turtle2.move(size); 
               turtle2.turn(turn); 
               
            }
           
        }
        
        
        turtle.hide();
        turtle2.hide();
    }
}
