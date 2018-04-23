package kodea;

import java.util.*;

import kartak.KartaAnimali;

public class ListaKartakTableroan {
	private ArrayList<KartaAnimali> kartak;
	private boolean ordenean;	// boolear honek lista zein aldetik begiratzen dugun esaten du, true eskuinetik ezkerrera, hau da, ezkerrean zerua eta eskuinean kalea
	public ListaKartakTableroan() {
		this.kartak=new ArrayList<KartaAnimali>();
		this.ordenean=true;
	}
	public void gehituAnimali(KartaAnimali pKarta) {
		//animali bat tablerora gehitu posible baldin bada eta bere posizioan
		if(this.luzera()<5&&this.ordenean) {
			this.kartak.add(pKarta);
		}else if(this.luzera()<5&&!this.ordenean) {
			this.kartak.add(0,pKarta);
		}
	}
	public void aldatuOrdena() {
		//tableroa zelan ikusten de aldatzen du
		if(this.ordenean) {
			this.ordenean=false;
		}else {
			this.ordenean=true;
		}
	}
	public void kenduAnimali(KartaAnimali pKarta) {
		this.kartak.remove(pKarta);
	}

	public void egikarituLista() {
		//Animaladak turnoak amaitzerakoan egiten ditu, bakarrik errekurtsiboak
		KartaAnimali an=null;
		if(this.ordenean) {
			for (int i=this.luzera()-1;i>=0;i--) {
				an=this.kartak.get(i);
				if(an.errekurtsiboaDa()) {
					//EGIN ANIMALADA
				}
			}
		}else {
			for (int i=0;i<this.luzera();i++) {
				an=this.kartak.get(i);
				if(an.errekurtsiboaDa()) {
					//EGIN ANIMALADA
				}
			}
		}

	}
	public int luzera() {
		return this.kartak.size();
	}
	public void zeruaKalea() {
		//Animaladen ostean bost karta baleudeneko kasuan zerura edo kalera mugitzen ditu kartak, ordena begiratuz
		if(this.ordenean) {
			KartaAnimali k1=this.kartak.get(0);
			Tablero tab=Tablero.getTableroa();
			tab.sartuZeruan(k1);
			this.kartak.remove(0);
			k1=this.kartak.get(0);
			tab.sartuZeruan(k1);
			this.kartak.remove(0);
			k1=this.kartak.get(2);
			tab.ateraKanpora(k1);
			this.kartak.remove(2);
		}else {
			KartaAnimali k1=this.kartak.get(4);
			Tablero tab=Tablero.getTableroa();
			tab.sartuZeruan(k1);
			this.kartak.remove(4);
			k1=this.kartak.get(3);
			tab.sartuZeruan(k1);
			this.kartak.remove(3);
			k1=this.kartak.get(0);
			tab.ateraKanpora(k1);
			this.kartak.remove(0);
		}

	}
	public ArrayList<KartaAnimali> getKartak(){
		return this.kartak;
	}
}
