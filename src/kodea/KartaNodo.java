package kodea;

import kartak.*;

public class KartaNodo {
	//USELESS
	private KartaNodo 	hurrengoa;
	private KartaNodo 	aurrekoa;
	private KartaAnimali	karta;
	
	public KartaNodo(KartaAnimali karta) {
		this.karta=karta;
	}
	
	public void trukaketa() {
		KartaNodo aux = this.aurrekoa;
		this.setAurrekoa(this.hurrengoa);
		this.setHurrengoa(aux);
	}
	
	public KartaNodo getHurrengoa() {
		return hurrengoa;
	}
	public KartaNodo getAurrekoa() {
		return aurrekoa;
	}
	public KartaAnimali getKarta() {
		return karta;
	}

	public void setHurrengoa(KartaNodo hurrengoa) {
		this.hurrengoa = hurrengoa;
	}

	public void setAurrekoa(KartaNodo aurrekoa) {
		this.aurrekoa = aurrekoa;
	}

	public void setKarta(KartaAnimali karta) {
		this.karta = karta;
	}
	
	public KartaAnimali remove(){
		if (hurrengoa!=null){
		hurrengoa.setAurrekoa(this.aurrekoa);
		}
		if (aurrekoa !=null){
		aurrekoa.setHurrengoa(this.hurrengoa);
		}
		return (this.karta);
	}
	
	
}
