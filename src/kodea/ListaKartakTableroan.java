package kodea;

import java.util.*;

import kartak.Kameleoi;
import kartak.KartaAnimali;
import kartak.KartaFactory;
//
public class ListaKartakTableroan {
	private static ListaKartakTableroan nireListaKartak;
	private KartaNodo 	lehenengoa;
	private KartaNodo 	amaierakoa;
	private int 			counter;
	public ListaKartakTableroan() {
		this.lehenengoa = null;
		this.amaierakoa = null;
		this.counter 	= 0;
	}
	public static ListaKartakTableroan getNireListaKartakTableroan() {
		if(nireListaKartak==null) {
			nireListaKartak=new ListaKartakTableroan();
		}
		return nireListaKartak;	}
	
	public void gehituAnimali(KartaNodo pKarta) {
		KartaNodo berria = 	pKarta;
		if (counter==0) {
			lehenengoa=berria;
			amaierakoa=berria;
		}else {
			this.amaierakoa.setHurrengoa(pKarta);
			berria.setAurrekoa(this.amaierakoa);
			this.setAmaierakoa(berria);
		}	
		this.counter++;
	}
	
	private void setAmaierakoa(KartaNodo berria) {
		this.amaierakoa=berria;
	}
	public void setLehenengoa(KartaNodo animalia) {
		lehenengoa = animalia;
	}	
	
	public void aldatuOrdena() {
		//tableroa zelan ikusten de aldatzen du
		KartaNodo aux = lehenengoa;
		KartaNodo lh = lehenengoa;
		KartaNodo am = amaierakoa;
		
		for (int i = 0; i < this.luzera(); i++) {
			aux.trukaketa();
			aux = aux.getAurrekoa();
		}
		lehenengoa=am;
		amaierakoa=lh;
		
	}
	public void kenduAnimali(int pPos) {
		KartaNodo aux = lehenengoa;
		
		if(counter!=0) {
			if (pPos==0) {
				setLehenengoa(aux.getHurrengoa());
				lehenengoa.setAurrekoa(null);
			}else if (pPos==counter-1) {
				aux=amaierakoa;
				setAmaierakoa(aux.getAurrekoa());
				amaierakoa.setHurrengoa(null);
			}else {
				for (int i = 0; i < pPos; i++) {
					aux=aux.getHurrengoa();
				}
				aux.getAurrekoa().setHurrengoa(aux.getHurrengoa());
				aux.getHurrengoa().setAurrekoa(aux.getAurrekoa());
			}
			this.counter--;
		}
		
	}
	
	public int luzera() {
		return(this.counter);
	}
	public void zeruaKalea() {
		Tablero.getTableroa().getBarruan().add(lehenengoa.getKarta());
		this.kenduAnimali(0);
		Jokoa.getJokoa().aldatuta();
		Tablero.getTableroa().getBarruan().add(lehenengoa.getKarta());
		this.kenduAnimali(0);
		Jokoa.getJokoa().aldatuta();
		Tablero.getTableroa().getKanpoan().add(amaierakoa.getKarta());
		this.kenduAnimali(this.luzera()-1);
		Jokoa.getJokoa().aldatuta();
	
}
	public ArrayList<KartaAnimali> getKartak(){
		ArrayList<KartaAnimali> 	aux = 	new ArrayList<KartaAnimali>();
		KartaNodo	nodo				=	lehenengoa;
		for (int i = 0; i < this.luzera(); i++) {
			aux.add(nodo.getKarta());
			nodo=nodo.getHurrengoa();
		}
		return aux;
	}
	public void aldatuPos(int pHasi, int pZenbat) {
		//cambiar la kartaAnimali del interior no la informacion aurreko/hurrengo.
		//egin JUnit-a
		while(pZenbat!=0&&pHasi!=0) {
			KartaNodo aux = this.getKartaListan(pHasi);
			KartaAnimali kAnimali = aux.getKarta();
			aux.setKarta(aux.getAurrekoa().getKarta());
			aux.getAurrekoa().setKarta(kAnimali);
			pZenbat--;
			pHasi--;
		}
		
	}
	public KartaNodo getKartaListan(int pPos) {
		KartaNodo k=this.lehenengoa;
		int i=0;
		while(i!=pPos) {
			k=k.getHurrengoa();
			i++;
		}
		return k;
	}
    public ArrayList<KartaAnimali> errekurtsiboakLortu() {
    		ArrayList<KartaAnimali> animaliak = new ArrayList<KartaAnimali>();
     		if (counter>0){
     			KartaNodo aux = lehenengoa;
    			while (aux!=null) {
    				if (aux.getKarta().errekurtsiboaDa()){
    					animaliak.add(aux.getKarta());
    				}
    				aux = aux.getHurrengoa();
    			}
     		}
     		return (animaliak);
    	}
    public int posizioaLortu(String pPath) {
		int emaitza = -1;
		boolean aurkituta=false;
 		if (counter>0){
		KartaNodo aux = lehenengoa;
			while ((aurkituta==false)&&(emaitza<=counter)){
				emaitza++;
				if (aux.getKarta().getPath()==pPath){
					aurkituta=true;
				}else{
					aux=aux.getHurrengoa();
				}
			}
 		}
 		return (emaitza);
	}
    public ArrayList<Integer> posizioakLortu(String pAnimali) {
		ArrayList<Integer> emaitza = new ArrayList<Integer>();
		Integer counter = -1;
 		if (this.counter>0){
		KartaNodo aux = lehenengoa;
		emaitza.add(this.counter-1);
			while (aux.getHurrengoa()!=null){
				counter++;
				if (aux.getKarta().getIzena().equals(pAnimali)){
					emaitza.add(counter);
				}
					aux=aux.getHurrengoa();
			}
 		}
 		return (emaitza);
	}
    public ArrayList<Integer> listakoLvlAkLortu() {
		ArrayList<Integer> emaitza = new ArrayList<Integer>();
 		if (this.counter>0){
		KartaNodo aux = lehenengoa;
			while (aux.getHurrengoa()!=null){
				counter++;
				emaitza.add(aux.getKarta().animaliZenbakia());
				aux=lehenengoa.getHurrengoa();
			}
 		}
 		return (emaitza);
	}
    public void ordSugea() {
		boolean ordenatuta=true;
		KartaNodo k=this.lehenengoa;
		while(this.counter!=0 && k.getHurrengoa()!=null) {
			if(k.getKarta().animaliZenbakia()<k.getHurrengoa().getKarta().animaliZenbakia()) {
				KartaAnimali an=k.getKarta();
				k.setKarta(k.getHurrengoa().getKarta());
				k.getHurrengoa().setKarta(an);
				ordenatuta=false;
			}
			k=k.getHurrengoa();
		}
		if(!ordenatuta) {
			this.ordSugea();
		}
		
	}
	public void aldatuKamaleoia() {
		// TODO Auto-generated method stub
		KartaNodo aux = lehenengoa;
		while (aux!=null) {
			if (aux.getKarta().getEgoeraBerezia()) {
				aux.setKarta(KartaFactory.getKartaFactory().createKarta(Jokoa.getJokoa().getJokalariak().getKolorea(), 5));
			}
			aux=aux.getHurrengoa();
		}
	}
}
