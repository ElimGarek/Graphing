import java.awt.Color;

public class PaintLesson{    
    
    public static void main(String[] args) {
                double y;
		double a, h, k;

		Graphing gp1 = new Graphing(10,10);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 1;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp1.drawPoint(x,y);
		}

		Graphing gp2 = new Graphing(320,10);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 1;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp2.drawPoint(x,y);
		}

		Graphing gp3 = new Graphing(630,10);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 1;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp3.drawPoint(x,y);
		}

		Graphing gp4 = new Graphing(10,320);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 1;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp4.drawPoint(x,y);
		}

		Graphing gp5 = new Graphing(320,320);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 1;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp5.drawPoint(x,y);
		}

		Graphing gp6 = new Graphing(630,320);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 1;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp6.drawPoint(x,y);
		}

    }
    
}
