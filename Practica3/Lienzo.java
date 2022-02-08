import java.awt.*;
import javax.swing.JFrame;

public class Lienzo extends Canvas
{
	Figura figuras[] = new Figura[20];

	public void paint(Figura c)
	{
	
		for(int i=0;i<figuras.length;i++)
			if(figuras[i]==null)
			{
				figuras[i] = c;
				i=figuras.length;
			}			
	}



	public void paint(Graphics g)
	{
		for(Figura f:figuras)
			if(f != null)
				f.pintar(g); //Estamos haciendo uso del polimorfismo

	}
}

	/*public void paint(Graphics g)
	{	
		for(int i=0; i<20 ; i++)
		{
			if(figuras[i]!=null)
			{

				if (figuras[i] instanceof Cuadrado)
				{
					Cuadrado c = (Cuadrado)figuras[i];
					g.setColor(c.getColor());

					if(c.getRelleno() == true)
						g.fillRect(c.getX(),c.getY(),c.getLado(),c.getLado()); 
					else
						g.drawRect(c.getX(),c.getY(),c.getLado(),c.getLado()); 
				}

				else if(figuras[i] instanceof Circulo)
				{ 
					Circulo c = (Circulo)figuras[i];
					g.setColor(c.getColor());

					if(c.getRelleno() == true)
						g.fillOval(c.getX(),c.getY(),c.getRadio(),c.getRadio()); 
					else
						g.drawOval(c.getX(),c.getY(),c.getRadio(),c.getRadio()); 
				}
							


			}
		}
	}
}


//if (a instanceof X) { // do something }

//Fuente: https://www.iteramos.com/pregunta/76911/comprobar-si-un-objeto-pertenece-a-una-clase-en-java

*/


