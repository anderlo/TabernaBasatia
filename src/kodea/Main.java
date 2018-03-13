package kodea;

import kartak.*;
import interfazeak.UIModua;

public  class Main {
	public Main() {
		//crear los dos jugadores,las cartas y el tablero (poner en el tablero la cartas)
		this.hasieratu();
		Jokoa.getJokoa();
		new UIModua();
	}
	private void hasieratu() {
		//factory bakoitzari deia egin eta gauzak esleitu
		ListaJokalari.getListaJokalari();
		ListaKartak kartakBerdea = KartaFactory.getFactory(berdea);
		ListaKartak kartakUrdinak = KartaFactory.getFactory(urdina);
		Ostikada ostikada = (ostikada)KartaFactory.getFactory(ostikada);
		
			
		}
		
		
	}
	public static void main(String[] args) {
		new Main();
	}
}