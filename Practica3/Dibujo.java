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





