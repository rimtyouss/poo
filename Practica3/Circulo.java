import java.awt.Color;
import java.awt.*;
import javax.swing.JFrame;

public class Circulo extends Figura
{
	int radio;

	static boolean RELLENO;

	Circulo(int x, int y, Color color, int radio,boolean relleno)
	{
		super(x,y,color,relleno);
		this.radio=radio;
	}

	

	int getRadio()
	{
		return radio;
	}

	void setRadio(int radio)
	{
		if(x>1 && x<600)
			this.radio = radio;
		else
			this.radio = 2;
	}


	void pintar(Graphics g)
	{
		g.setColor(g.getColor());
		
		if(super.relleno == false)
			g.drawOval(this.getX(), this.getY(), this.getRadio(), this.getRadio());
		if(super.relleno == true)
			g.fillOval(this.getX(), this.getY(), this.getRadio(), this.getRadio());	 
		
	
	}

	@Override
	String getInfo()
	{
		return super.getInfo() + "\t Es un circulo de radio " + "-" + radio;
	}	


}