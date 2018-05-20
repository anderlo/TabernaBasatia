package kodea;
import java.util.*;
public class ListaJokalari {
	private ArrayList<Jokalari> jokalari;
	private static ListaJokalari nListaJokalari;
	private int turnoa;
	public ListaJokalari() {
		this.jokalari=new ArrayList<Jokalari>();
		this.turnoa=0;
	}
	public void jokalariakSartu(Jokalari pJok) {
		this.jokalari.add(pJok);
	}
	public void hustu() {
		nListaJokalari=null;
	}
	public static ListaJokalari getNireListaJokalari() {
		if(nListaJokalari==null) {nListaJokalari= new ListaJokalari();}
		return nListaJokalari;
	}
	public void turnoaPasatu() {
		if(this.jokalari.size()-1<=this.turnoa) {
			this.turnoa=0;
		}else {
			this.turnoa++;
		}
	}
	public Jokalari getTurnoaDuenJokalaria() {
		return this.jokalari.get(this.turnoa);
	}
	public Jokalari getJokalariNormala(int pos) {
		return this.jokalari.get(pos);
	}
	public int jokKop() {
		return this.jokalari.size();
	}
	public int getTurnoa() {
		return this.turnoa;
	}
	public void ezabatuJokalaria(int nZ) {
		this.jokalari.remove(nZ);
	}
	public String getKolorea() {
		if(this.getTurnoaDuenJokalaria() instanceof Pertsona) {
			return "Urdina";
		}else {
			return "Berdea";
		}
	}
}
