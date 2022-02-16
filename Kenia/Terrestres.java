public class Terrestres extends AreaProtegida
{

String tipoTerreno;



Terrestres(String nombre, int extension, int numEspecies,String tipoArea, String tipoTerreno, int subvGob,String ong)
{
	super(nombre,extension,numEspecies,tipoArea,subvGob,ong);
	this.tipoTerreno = tipoTerreno;

}


String getTipoTerreno()
{
	return tipoTerreno;
}

void setTipoTerreno(String tipoTerreno)
{
	this.tipoTerreno = tipoTerreno;
}

@Override
public String toString()
	{
		return super.toString() + " y es un terreno de tipo : " + tipoTerreno;
	}

}