package kodea;

import java.util.*;

import kartak.KartaAnimali;

public class ListaKartakTableroan {
	private ArrayList<KartaAnimali> kartak;
	
	public ListaKartakTableroan() {
		this.kartak=new ArrayList<KartaAnimali>();
	}
	public void gehituAnimali(KartaAnimali pKarta) {
		this.kartak.add(pKarta);
	}
	public void kenduAnimali(KartaAnimali pKarta) {
		this.kartak.remove(pKarta);
	}

	public void errekorrituLista() {
		KartaAnimali an=null;
		for (int i=this.luzera();i>0;i--) {
			an=this.kartak.get(i);
			if(an.errekurtsiboaDa()) {
				//EGIN ANIMALADA
			}
		}
	}
	public int luzera() {
		return this.kartak.size();
	}
}
