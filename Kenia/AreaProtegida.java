public class AreaProtegida extends Parque
{
	
public static final String ACUATICAS = "Acuatica";
public static final String TERRESTRES = "Terrestre";
public static final String OTRAS = "Otras";

// COMO HACER LO DE NUM LAGOS NUM ... ??

int subvGob;
String tipoArea;
String ong;


AreaProtegida(String nombre, int extension, int numEspecies,String tipoArea, int subvGob,String ong)
{
	super(nombre,extension,numEspecies);
	this.subvGob = subvGob;
	this.ong = ong;
	this.setTipoArea(tipoArea);

}

void setTipoArea(String tipoArea)
{
	if (tipoArea.equals(ACUATICAS) || tipoArea.equals(TERRESTRES) || tipoArea.equals(OTRAS))
		this.tipoArea = tipoArea;
}

int getSubvGob()
{
	return subvGob;
}

void setSubvGob(int subvGob)
{
	this.subvGob = subvGob;
}


String getOng()
{
	return ong;
}

void setOng(String ong)
{
	this.ong = ong;
}


@Override
public String toString()
	{
		return super.toString() + "y el tipo de Area es : " + tipoArea +  "-" + "Subvencion Gobierno :" + subvGob + "(Chelines)" + "-" + "y la Ong colaboradora es : " + ong;
	}

}
