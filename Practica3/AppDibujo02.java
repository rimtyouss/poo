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

