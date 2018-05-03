package kartak;

import interfazeak.UIKameleoi;

//El camaleón realiza la animalada de una de las especies que haya en la cola.
//Para efectuar dicha animalada (y solo en ese caso), el camaleón adopta 
//también la fuerza de la especie imitada. Pero en cuanto se llevan a cabo las 
//animaladas recurrentes (incluso en el mismo turno), el camaleón vuelve a ser un 
//camaleón con una fuerza de 5.
public class Kameleoi extends KartaAnimali{

	public Kameleoi(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void animaladaBurutu() {
		// TODO Auto-generated method stub
		UIKameleoi.main();
	}

}
