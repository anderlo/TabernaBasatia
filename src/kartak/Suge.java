package kartak;

import java.util.ArrayList;

import kodea.ListaKartakTableroan;

//El efecto de la serpiente consiste en que todos los animales que se encuentran en la cola 
//se ordenan de inmediato seg�n su fuerza: el animal m�s fuerte se coloca el primero de la 
//cola frente a la Puerta del Cielo, y los dem�s animales se ordenan detr�s de �l seg�n su 
//fuerza. Los miembros de la misma especie no intercambian sus posiciones.
public class Suge extends KartaAnimali{
	private OrdenatuHanditikTxikira ord;
	public Suge(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.ord=new OrdenatuHanditikTxikira();
	}

	@Override
	public boolean animaladaBurutu() {
		// TODO Auto-generated method stub
		this.ord.ordenatu();
		return true;
	}
}
