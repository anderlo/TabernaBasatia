package kartak;

import kodea.Jokoa;
import kodea.ListaKartakTableroan;

//Una jirafa se cuela delante de un animal m�s 
//d�bil si lo tiene directamente delante de ella. 
//De no ser as�, la jirafa se queda donde est�.
//recurrente
public class Jirafa extends KartaAnimali{
	private OrdenatuNormala ordenatu;

	public Jirafa(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.errekurrentea=true;
		this.ordenatu = new OrdenatuNormala();
	}

	@Override
	public boolean animaladaBurutu() {
		// TODO Auto-generated method stub
		ListaKartakTableroan kartak = Jokoa.getJokoa().getTablero().getJokoan();
		int pos = kartak.posizioaLortu(path);
		if (pos>0) {
			if (kartak.getKartaListan(pos-1).getKarta().animaliZenbakia()<this.zenbakia) {
				ordenatu.ordenatu(pos, 1);
			}
		}
		return true;
	}

}
