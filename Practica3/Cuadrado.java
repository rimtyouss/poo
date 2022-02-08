import java.awt.Color;
import java.awt.*;
import javax.swing.JFrame;

public class Cuadrado extends Figura
{

	int lado;

	Cuadrado(int x, int y, Color color, int lado,boolean relleno)
	{
		super(x,y,color,relleno);
		this.lado=lado;
	}


	int getLado()
	{
		return lado;
	}

	void setLado(int lado)
	{
		if(x>1 && x<600)
			this.lado = lado;
		else
			this.lado = 2;
	}

	void pintar(Graphics g)
	{
		g.setColor(g.getColor());

		if(super.relleno == false)
			g.drawRect(this.getX(), this.getY(), this.getLado(), this.getLado());
		if(super.relleno == true)
			g.fillRect(this.getX(), this.getY(), this.getLado(), this.getLado());	 
		
	}


	@Override
	String getInfo()
	{
		return super.getInfo() + " \t Es un cuadrado de lado "+ "-" + lado;
	}	

}