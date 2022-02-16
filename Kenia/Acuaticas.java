public class Acuaticas extends AreaProtegida
{

int numLagos;



Acuaticas(String nombre, int extension, int numEspecies,String tipoArea, int numLagos, int subvGob,String ong)
{
	super(nombre,extension,numEspecies,tipoArea,subvGob,ong);
	this.numLagos = numLagos;

}


int getNumLagos()
{
	return numLagos;
}

void setNumLagos(int numLagos)
{
	this.numLagos = numLagos;
}

@Override
public String toString()
	{
		return super.toString() + " y tiene  : " + numLagos + " lagos ";
	}











}