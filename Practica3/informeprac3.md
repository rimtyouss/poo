## Práctica 03. POO intermedio. Herencia y polimorifismo. 
## Rim Tyouss



# Figura

```java
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
``` 

# Cuadrado

```java
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
```

# Circulo

```java
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
```

# Lienzo

```java

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

```

# Dibujo

```java

import java.awt.*;
import javax.swing.JFrame;

public class Dibujo extends JFrame
{
	Lienzo lienzo;

	public Dibujo()
	{
		super("Dibujo");
		lienzo = new Lienzo();
		lienzo.setSize(800,600);
		this.add(lienzo);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void pintar(Figura figuras)
	{
		lienzo.paint(figuras);
		lienzo.repaint();
	}

}
```


## APP DIBUJO 01

```java

import java.awt.Color;

public class AppDibujo01
{
	public static void main( String[] args )
	{
		Dibujo dibujo = new Dibujo();


		Figura figuras[] = new Figura[20];



		figuras[0] = (new Cuadrado(100, 50,Color.RED,200,true));
		figuras[1] = (new Cuadrado(400, 50,Color.BLUE,200,true));	
		figuras[2] = (new Circulo(100, 200,Color.BLACK,300,false));
		figuras[3] = (new Circulo(400,200,Color.PINK,300,true));


		/* figuras[0].setColor(Color.RED);
		figuras[1].setColor(Color.BLUE);
		figuras[2].setColor(Color.BLACK);
		figuras[3].setColor(Color.CYAN);
		*/


		for(Figura f:figuras)
			if(f!= null)
				System.out.println(f.getInfo());


		dibujo.pintar(figuras[0]);
		dibujo.pintar(figuras[1]);
		dibujo.pintar(figuras[2]);
		dibujo.pintar(figuras[3]);



	}
}

```


## APP DIBUJO 02

```java

import java.awt.Color;

public class AppDibujo02
{
	public static void main( String[] args )
	{
		Dibujo dibujo = new Dibujo();
		Figura figuras[] = new Figura[10];

		//for(int i=0; i<20 ; i++)

	
		for(int i=0;i<10;i++)
		{
				dibujo.pintar(new Circulo(i*20, i*20,Color.RED,200,false));
				Util.wait(1);
			
		}

		

	}
}


```




