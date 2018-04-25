package kartak;

import interfazeak.UIKanguru;
import kodea.ListaKartakTableroan;
import kodea.Tablero;

//Un canguro salta por encima del último o de los dos últimos animales de la fila 
//(a discreción del jugador), sin importar la fuerza de dichos animales
public class Kanguru extends KartaAnimali{
	
	protected static Ordenatu ordenatuKanguru;

	public Kanguru(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.ordenatuKanguru = new OrdenatuNormala();
	}

	@Override
	public void animaladaBurutu() {
		// TODO Auto-generated method stub
		if (ListaKartakTableroan.getNireListaKartakTableroan().luzera()==1) {
			ordenatuKanguru.ordenatu(1, 1);
		}else if(ListaKartakTableroan.getNireListaKartakTableroan().luzera()>1) {
			UIKanguru.main(null);
		}
		
		
	}
	public static Ordenatu getOrdenatu() {
		return ordenatuKanguru;
	}
}
