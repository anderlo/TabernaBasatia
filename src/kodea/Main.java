package kodea;

import kartak.*;
import interfazeak.UIModua;

public  class Main {
	public Main() {
		//crear los dos jugadores,las cartas y el tablero (poner en el tablero la cartas)
		this.hasieratu();
		new UIModua();
	}
	private void hasieratu() {
		//factory bakoitzari deia egin eta gauzak esleitu
		Pertsona jokalari1 = new Pertsona();
		jokalari1.barajanSartu(ListaKartakFactory.getListaKartaFactory().createListak("Urdina"));
		Ordenagailua IA = new Ordenagailua();
		IA.barajanSartu(ListaKartakFactory.getListaKartaFactory().createListak("Berdea"));
		Tablero.getTableroa();
		
		
			
	}
	public static void main(String[] args) {
		new Main();
	}
}