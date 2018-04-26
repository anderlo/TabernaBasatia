package kartak;

public abstract class KartaAnimali extends Karta{
	protected String animalia;
	protected String kolore;
	protected int zenbakia;
	protected boolean egoeraBerezia;
	protected Boolean errekurrentea;
	public KartaAnimali(String kolorea,int zenbakia) {
		this.kolore 		= null;
		this.zenbakia 		= zenbakia;
		this.errekurrentea 	= false;
		this.egoeraBerezia 	= false;
		if (kolorea =="Urdina"||kolorea=="Berdea") {
			this.kolore 		= kolorea;
		}
		this.animalia = this.getClass().getName().split("kartak.")[1];
		this.setPath();
		this.setIzena();
	}	
	@Override
	protected void setPath() {
		// TODO Auto-generated method stub
		if (this.kolore != null){
			this.path = "Images/"+this.animalia+""+this.kolore+".jpg";
		}
		else {
			this.path=null;
		}
	}
	public int animaliZenbakia() {
		return this.zenbakia;
	}
	public void setIzena(String pIzena) {
		this.izena = pIzena;
	}
	public void setZenbakia(int pZenbakia) {
		this.zenbakia = pZenbakia;
	}
	public void aldatuEgoeraBerezia() {
		if(this.egoeraBerezia) {
			this.egoeraBerezia = false;
		}else {
			this.egoeraBerezia = true;
		}
	}
	public boolean getEgoeraBerezia() {
		return this.egoeraBerezia;
	}
	public boolean errekurtsiboaDa() {
		return this.errekurrentea;
	}
	public abstract void animaladaBurutu();
}