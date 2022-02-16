public class App
{
	public static void main(String[] args)
	{



	Parque parques[] = new Parque[5];


	parques[0] = (new ReservaDeCaza("Parque 1 Caza",3500,200,1000,ReservaDeCaza.ARMA));
	parques[1] = (new ReservaDeCaza("Parque 2 Caza",5000,450,5000,ReservaDeCaza.ARMA));

	parques[2] = (new Acuaticas("Parque 1 Protegido",1000,300,AreaProtegida.ACUATICAS,3,500,"El Refugio"));
	parques[3] = (new Acuaticas("Parque 2 Protegido",2000,500,AreaProtegida.ACUATICAS,4,1000,"Proteger los Animales"));
	parques[4] = (new Terrestres("Parque 3 Protegido",300,20,AreaProtegida.TERRESTRES,"tierra",400,"IloveAnimales"));


for(Parque p:parques)
        {
            if(p!=null)
            {
                System.out.println(p.toString());
            }
        }




		
 }













}