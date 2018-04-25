package kartak;

//Las cebras están activas de forma recurrente. Su animalada consiste en que 
//nunca pueden ser adelantadas por los hipopótamos ni pueden ser 
//adelantadas o comidas por los cocodrilos
//. Por lo tanto, todos los animales que 
//estén en la cola delante de una cebra están siempre protegidos de las embestidas de 
//los hipopótamos y de la voracidad de los cocodrilos.
public class Zebra extends KartaAnimali{

	public Zebra(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.errekurrentea=true;
	}

	@Override
	public void animaladaBurutu() {
		// TODO Auto-generated method stub
		
	}

}
