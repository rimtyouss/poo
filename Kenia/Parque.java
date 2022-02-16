public class Parque{

int extension;
int numEspecies;
String nombre;



Parque(String nombre, int extension, int numEspecies)
	{
		this.nombre = nombre;
		this.extension = extension;
		this.numEspecies = numEspecies;
	}



String getNombre()
{
	return nombre;
}

void setNombre(String nombre)
{
	this.nombre = nombre;

}


int getExtension()
{
	return extension;
}

void setExtension(int extension)
{
	this.extension = extension;
}



int getNumEspecies()
{
	return numEspecies;
}

void setNumEspecies(int numEspecies)
{
	this.numEspecies = numEspecies;
}


public String toString()
{
	return  nombre + "\t-" + " Mide: "+ extension + " km, y tiene " + numEspecies + " especies ";
}


}