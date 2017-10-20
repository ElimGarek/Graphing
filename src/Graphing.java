import javax.swing.JFrame;
import java.awt.*;
public class Graphing extends JFrame {
    private static Graphics gBuf = null;
    private static GraphPaperCanvas canvas = null;
    private static Image vm = null;
    private int x, y;
    private int w, h;
    
    public Graphing(int x, int y){
        if (canvas == null){
            setTitle("Graph Paper");
            setSize(1100, 950);
            setLocation(20,50);
            
            canvas = new GraphPaperCanvas(null);
            getContentPane().add(canvas);
            setVisible(true);
            
            vm = canvas.createImage(1100, 950);
            gBuf = vm.getGraphics();
            canvas.setVm(vm);
            
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            
        }
        this.x = x;
        this.y = y;
        w = 300;
        h = 300;
        getBounds();
        gBuf.setColor(Color.blue);
        
    }
    
    public void drawBounds(){
        Color cur = gBuf.getColor();
        gBuf.setColor(Color.RED);
        for(int d = 0 ; d < w; d += w/20)
            gBuf.drawLine(x + d, y + 0, x + h, y + d);
        for(int d = 0; d < h; d += h/20)
            gBuf.drawLine(x + 0, y + d, x + h, y + d);
        
        gBuf.setColor(Color.BLACK);
        gBuf.drawLine(x + w/2, y + 0, x + w/2, + h);
        gBuf.drawLine(x + 0, y + h/2, x + w, y + h/2);
        gBuf.drawRect(x,y,w+1,h+1);
        gBuf.setColor(cur);
        canvas.repaint();
        
    }
    
    public void setColor(Color c){
        gBuf.setColor(c);
    }
    
    public void drawPoint(double px, double py){
        px *= w/20;
        py *= h/20;
        px += w/2 + 1;
        py += h/2 + 1;
        
        gBuf.drawLine(x + (int)px, y + (int)py, x + (int)px, y + (int)py);
        canvas.repaint();
        
    }
}
class GraphPaperCanvas extends Canvas{
    private Image vm;
    
    public GraphPaperCanvas(Image vm){
        this.vm = vm;
        
    }
    public void setVm( Image vm){
        this.vm = vm;
    }
    public void paint(Graphics g){
        g.drawImage(vm, 0, 0, this);
    }
    public void update(Graphics g){
        paint(g);
    }
}