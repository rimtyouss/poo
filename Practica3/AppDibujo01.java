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

