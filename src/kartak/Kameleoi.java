package kartak;

import interfazeak.UIKameleoi;
import kodea.ListaJokalari;
import kodea.ListaKartakTableroan;

//El camale�n realiza la animalada de una de las especies que haya en la cola.
//Para efectuar dicha animalada (y solo en ese caso), el camale�n adopta 
//tambi�n la fuerza de la especie imitada. Pero en cuanto se llevan a cabo las 
//animaladas recurrentes (incluso en el mismo turno), el camale�n vuelve a ser un 
//camale�n con una fuerza de 5.
public class Kameleoi extends KartaAnimali{

	public Kameleoi(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean animaladaBurutu() {
		// TODO Auto-generated method stub
		if(ListaJokalari.getNireListaJokalari().getTurnoa()==0) {
			if (ListaKartakTableroan.getNireListaKartakTableroan().luzera()!=1) {
				UIKameleoi.main();
				return false;
			}else{
				return true;
			}
		}else {
			this.animaladaBurutuIA();
			return true;
		}
		
	}
	public void animaladaBurutuIA() {
		
	}

}
