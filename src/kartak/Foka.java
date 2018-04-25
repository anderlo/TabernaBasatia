package kartak;

import kodea.ListaKartakTableroan;

//Al jugar una foca, se intercambia la posici�n de la Puerta del Cielo con la de la 
//carta de patada.
public class Foka extends KartaAnimali{

	public Foka(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void animaladaBurutu() {
		ListaKartakTableroan.getNireListaKartakTableroan().aldatuOrdena();
	}

}
