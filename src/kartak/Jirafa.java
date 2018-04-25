package kartak;

import kodea.Jokoa;
import kodea.ListaKartakTableroan;

//Una jirafa se cuela delante de un animal más 
//débil si lo tiene directamente delante de ella. 
//De no ser así, la jirafa se queda donde está.
//recurrente
public class Jirafa extends KartaAnimali{
	private Ordenatu ordenatu;

	public Jirafa(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.errekurrentea=true;
		this.ordenatu = new OrdenatuNormala();
	}

	@Override
	public void animaladaBurutu() {
		// TODO Auto-generated method stub
		ListaKartakTableroan kartak = Jokoa.getJokoa().getTablero().getJokoan();
		int pos = kartak.posizioaLortu(path);
		System.out.println(pos);
		if (kartak.getKartaListan(pos-1).getKarta().animaliZenbakia()<this.zenbakia) {
			System.out.println("hola");
			ordenatu.ordenatu(pos, 1);
		}
	}

}
