package kartak;

//Las cebras est�n activas de forma recurrente. Su animalada consiste en que 
//nunca pueden ser adelantadas por los hipop�tamos ni pueden ser 
//adelantadas o comidas por los cocodrilos
//. Por lo tanto, todos los animales que 
//est�n en la cola delante de una cebra est�n siempre protegidos de las embestidas de 
//los hipop�tamos y de la voracidad de los cocodrilos.
public class Zebra extends KartaAnimali{

	public Zebra(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.errekurrentea=true;
	}

	@Override
	public boolean animaladaBurutu() {
		// TODO Auto-generated method stub
		return true;
	}

}
