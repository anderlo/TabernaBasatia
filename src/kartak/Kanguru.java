package kartak;

import java.util.Random;

import interfazeak.UIKanguru;
import kodea.ListaJokalari;
import kodea.ListaKartakTableroan;
import kodea.Tablero;

//Un canguro salta por encima del último o de los dos últimos animales de la fila 
//(a discreción del jugador), sin importar la fuerza de dichos animales
public class Kanguru extends KartaAnimali{
	
	protected static OrdenatuNormala ordenatuKanguru;

	public Kanguru(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.ordenatuKanguru = new OrdenatuNormala();
	}

	@Override
	public boolean animaladaBurutu() {
		// TODO Auto-generated method stub
		boolean jokatuta = false;
		if(ListaJokalari.getNireListaJokalari().getTurnoa()==0) {
			if(ListaKartakTableroan.getNireListaKartakTableroan().luzera()==2) {
				ordenatuKanguru.ordenatu(1, 1);
				jokatuta = true;
			}else if (ListaKartakTableroan.getNireListaKartakTableroan().luzera()>2) {
				UIKanguru.main();
			}
			}else {
			this.animaladaBurutuIA();
		}
		return jokatuta;

	}
	public static Ordenatu getOrdenatu() {
		return ordenatuKanguru;
	}
	public void animaladaBurutuIA() {
		// TODO Auto-generated method stub
		int zenbat = ListaKartakTableroan.getNireListaKartakTableroan().luzera();
		if(zenbat==2) {
			ordenatuKanguru.ordenatu(zenbat-1,1);
		}else {
			Random rd= new Random(); 
			int i= rd.nextInt(1)+1;
			System.out.println(i);
			ordenatuKanguru.ordenatu(zenbat-1,i);
		}
	}
}
