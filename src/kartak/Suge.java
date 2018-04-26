package kartak;

import java.util.ArrayList;

import kodea.ListaKartakTableroan;

//El efecto de la serpiente consiste en que todos los animales que se encuentran en la cola 
//se ordenan de inmediato según su fuerza: el animal más fuerte se coloca el primero de la 
//cola frente a la Puerta del Cielo, y los demás animales se ordenan detrás de él según su 
//fuerza. Los miembros de la misma especie no intercambian sus posiciones.
public class Suge extends KartaAnimali{
	private OrdenatuNormala ord;
	public Suge(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.ord=new OrdenatuNormala();
	}

	@Override
	public void animaladaBurutu() {
		// TODO Auto-generated method stub
		ListaKartakTableroan lk=ListaKartakTableroan.getNireListaKartakTableroan();
		ArrayList<Integer> lista=lk.listakoLvlAkLortu();
		
	}
}
