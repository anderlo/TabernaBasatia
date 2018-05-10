package kodea;

import java.util.ArrayList;

import kartak.KartaAnimali;

public class Ordenagailua extends Jokalari{

public void kartaJokatu() throws Exception {
	ArrayList<Integer> posibleak = new ArrayList<Integer>();
	if (this.getEskua().kopurua()>1){
		for (int i = 0; i < this.getEskua().kopurua(); i++) {
			if (BaiEz(this.getEskua().getKartak().get(i))) {
				posibleak.add(i);
			}	
			double zenbat = (double) posibleak.size();
			int zein = (int) (Math.random() * zenbat);
			Jokoa.getJokoa().kartaJokatu(this.getEskua().getKartak().get(zein).getIzena());
		}
	}else{
		Jokoa.getJokoa().kartaJokatu(this.getEskua().getKartak().get(0).getIzena());
	}
}	

private boolean BaiEz(KartaAnimali animalia) {
		ListaKartakTableroan		tablero 	= ListaKartakTableroan.getNireListaKartakTableroan();
		boolean 					emaitza = true;
		ArrayList<Integer> animaliPos = new ArrayList<Integer>();

		
		switch (animalia.getIzena()) {
		case "Lehoia":
			animaliPos 	= tablero.posizioakLortu("Lehoia");
			if (animaliPos != null) {
				emaitza=false;
			}
			break;
		case "Kokodrilo":
			animaliPos	= tablero.posizioakLortu("Zebra");
			if (animaliPos != null) {
				if (animaliPos.get(animaliPos.size()-1) == tablero.luzera()) {
					emaitza=false;
				}
			}
			break;
		case "Jirafa":
			animaliPos	= tablero.posizioakLortu("Kokodrilo");
			if (animaliPos != null) {
				if (animaliPos.get(animaliPos.size()-1) == tablero.luzera()) {
					emaitza=false;
				}
			}
		case "Tximino":
			animaliPos	= tablero.posizioakLortu("Tximino");
			if(animaliPos != null) {
				int nireBatura = 0;
				int bereBatura = 0;
				animaliPos	= tablero.posizioakLortu("Kokodrilo");
				for (int i = 0; i < animaliPos.size(); i++) {
					if (tablero.getKartaListan(animaliPos.get(i)).getKarta().getKolorea()=="Urdina"){
						nireBatura+=10;
					}else{
						bereBatura+=10;
						}
				}
				animaliPos	= tablero.posizioakLortu("Hipopotamoa");
				for (int i = 0; i < animaliPos.size(); i++) {
					if (tablero.getKartaListan(animaliPos.get(i)).getKarta().getKolorea()=="Urdina"){
						nireBatura+=11;
					}else{
						bereBatura+=11;
						}
				}
				if (nireBatura>bereBatura){
					emaitza=false;
				}else if ((nireBatura<bereBatura)||(nireBatura==bereBatura)){
					emaitza=true;
				}
			}
			break;
		case "Kanguru":
			animaliPos	= tablero.posizioakLortu("Kokodrilo");
			if (animaliPos != null) {
				if (animaliPos.get(animaliPos.size()-1) == tablero.luzera()) {
					emaitza=false;
				}
			}
			break;
		case "Loro":
			emaitza = false;
			animaliPos	= tablero.posizioakLortu("Kokodrilo");
			if (animaliPos != null) {
				for (int i = 0; i < animaliPos.size(); i++) {
					if (tablero.getKartaListan(animaliPos.get(i)).getKarta().getKolorea()=="Berdea"){
						emaitza=true;
					}
			}
			}
			animaliPos	= tablero.posizioakLortu("Lehoi");
			if (animaliPos != null) {
				for (int i = 0; i < animaliPos.size(); i++) {
					if (tablero.getKartaListan(animaliPos.get(i)).getKarta().getKolorea()=="Berdea"){
						emaitza=true;
					}
				}
			}
			animaliPos	= tablero.posizioakLortu("Hipopotamo");
			if (animaliPos != null) {
				for (int i = 0; i < animaliPos.size(); i++) {
					if (tablero.getKartaListan(animaliPos.get(i)).getKarta().getKolorea()=="Berdea"){
						emaitza=true;
					}
				}
			}
		break;
		case "Mofeta":
			emaitza = false;
			animaliPos	= tablero.posizioakLortu("Kokodrilo");
			if (animaliPos != null) {
				for (int i = 0; i < animaliPos.size(); i++) {
					if (tablero.getKartaListan(animaliPos.get(i)).getKarta().getKolorea()=="Urdina"){
						emaitza=true;
					}
			}
			}
			animaliPos	= tablero.posizioakLortu("Lehoi");
			if (animaliPos != null) {
				for (int i = 0; i < animaliPos.size(); i++) {
					if (tablero.getKartaListan(animaliPos.get(i)).getKarta().getKolorea()=="Urdina"){
						emaitza=true;
					}
				}
			}
			animaliPos	= tablero.posizioakLortu("Hipopotamo");
			if (animaliPos != null) {
				for (int i = 0; i < animaliPos.size(); i++) {
					if (tablero.getKartaListan(animaliPos.get(i)).getKarta().getKolorea()=="Urdina"){
						emaitza=true;
					}
				}
			}
		break;
	}
		return emaitza;
	}	
}