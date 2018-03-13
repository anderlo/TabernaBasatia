package kartak;

public class KartaAnimali extends Karta{
	protected String kolore;
	protected int zenbakia;
	protected String path;
	protected Boolean errekurrentea;
	public KartaAnimali(String kolorea,int zenbakia) {
		this.kolore 			= kolorea;
		this.zenbakia 		= zenbakia;
		this.path			= null;
		this.errekurrentea 	= false;
	}	
	public int animaliZenbakia() {
		return this.zenbakia;
	}
}
