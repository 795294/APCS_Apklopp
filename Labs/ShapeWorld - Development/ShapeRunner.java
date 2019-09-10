
/**
 * Write a description of class ShapeRunner here.
 *
 * @author (Peter Klopp)
 * @version (8/23)
 */
public class ShapeRunner
{
    
    public ShapeRunner(){
    }

    public static void main(){
        ShapeWorld shapeWorld = new ShapeWorld(800,800);
        
        APCSRectangle rectangle = new APCSRectangle(250,250,550,550);
        
        APCSTriangle triangle = new APCSTriangle(250,250,350,250,300,200);
        
        APCSTriangle triangle1 = new APCSTriangle(350,250,300,200,400,200);
        
        APCSTriangle triangle2 = new APCSTriangle(350,250,400,200,450,250);
        
        APCSTriangle triangle3 = new APCSTriangle(400,200,500,200,450,250);
        
        APCSTriangle triangle4 = new APCSTriangle(450,250,550,250,500,200);
        
        APCSTriangle triangle5 = new APCSTriangle(550,250,600,200,450,200);
        
        APCSTriangle triangle6 = new APCSTriangle(550,250,600,200,600,300);
        
        shapeWorld.addTriangle(triangle);
        
        shapeWorld.addTriangle(triangle1);
        
        shapeWorld.addTriangle(triangle2);
        
        shapeWorld.addTriangle(triangle3);
        
        shapeWorld.addTriangle(triangle4);
        
        shapeWorld.addTriangle(triangle5);
        
        shapeWorld.addTriangle(triangle6);
        
        shapeWorld.addRectangle(rectangle);
        
        
        
    }
}
