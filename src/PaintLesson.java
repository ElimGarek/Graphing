import java.awt.Color;

public class PaintLesson{    
    
    public static void main(String[] args) {
        double y, y2;
        
        GraphPaper gp1 = new GraphPaper(10, 10);
        for(double x = -10; x<=10; x+= 0.01){
            y = .75*x + 4;
            gp1.drawPoint(x,y);
        }
        
        GraphPaper gp2 = new GraphPaper(320, 10);
        for(double x = -10; x<=10 ; x+=.01){
            y = -2*(Math.pow(x-5, 2)) + 6; 
            gp2.drawPoint(x, y);
        }
        GraphPaper gp3 = new GraphPaper(630, 10);
        for(double x = -10; x<=10 ; x+=.01){
            y = -2*(Math.pow(x-5, 2)) + 6; 
            gp3.drawPoint(x, y);
        }   
        GraphPaper gp4 = new GraphPaper(10, 320);
        for(double x = -10; x<=10 ; x+=.01){
            y = -2*(Math.pow(x-5, 2)) + 6; 
            gp4.drawPoint(x, y);
        }
    }//end main    
}// end class
