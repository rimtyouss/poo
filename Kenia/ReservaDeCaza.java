public class ReservaDeCaza extends Parque{

// public static final int ESCOPETA = 0;

public static final String ARMA = "Escopeta";


int costeLicencia;
String tipoArma;


ReservaDeCaza(String nombre, int extension, int numEspecies,int costeLicencia, String tipoArma)
{
	super(nombre,extension,numEspecies);
	this.costeLicencia = costeLicencia;
	this.setTipoArma(tipoArma);

}

void setTipoArma(String tipoArma)
{
	if (tipoArma.equals(ARMA))
		this.tipoArma = tipoArma;
}

int getCosteLicencia()
{
	return costeLicencia;
}

void setCosteLicencia(int costeLicencia)
{
	this.costeLicencia = costeLicencia;
}


/* String getArmaAsTexto()
{
	String texto;

	switch(tipoArma)
	{
		case ESCOPETA:
			texto = "Escopeta";
			break;
	}
	return texto;
}
*/

@Override
public String toString()
{
	return super.toString() + "\n El coste de Licencia es de :" + costeLicencia + "(Chelines)" + "-" + "y el arma usado es : " + tipoArma + "-" ;

}

}
