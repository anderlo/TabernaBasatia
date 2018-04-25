package kartak;

import interfazeak.UIKanguru;
import kodea.ListaKartakTableroan;
import kodea.Tablero;

//Un canguro salta por encima del �ltimo o de los dos �ltimos animales de la fila 
//(a discreci�n del jugador), sin importar la fuerza de dichos animales
public class Kanguru extends KartaAnimali{
	
	protected static OrdenatuNormala ordenatuKanguru;

	public Kanguru(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.ordenatuKanguru = new OrdenatuNormala();
	}

	@Override
	public void animaladaBurutu() {
		// TODO Auto-generated method stub
		UIKanguru.main(null);
		
		
	}
	public static Ordenatu getOrdenatu() {
		return ordenatuKanguru;
	}
}
