import java.awt.Color;
import java.awt.*;

public class Figura
{
	int x;
	int y;
	Color color;

	boolean relleno;

	Figura(int x, int y, Color color, boolean relleno)
	{
		this.x=x;
		this.y=y;
		this.color = color;
		this.relleno = relleno;
	}

	int getX()
	{
		return x;
	}

	int getY()
	{
		return y;
	}

	
	void setX(int x)
	{
		if(x>0 && x<800)
			this.x = x;
	}

	void setY(int y)
	{
		if(y>0 && y<600)
			this.y = y;
	}

	void setRelleno(boolean relleno)
	{
		this.relleno = relleno;
	}

	boolean getRelleno()
	{
		return relleno;
	}



	String getInfo()
	{
		return "Coordenada x " + x + "-" + "Coordenada y " + y + "-" + "y de color : " + color;
	}	


	Color getColor() 
	{
		return color;
    }

    void setColor(Color color) 
    {
		this.color = color;
    }


    void pintar(Graphics g)
    {
    	g.setColor(color);
    }

}
