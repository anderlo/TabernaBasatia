package kartak;

public class KartaAnimali extends Karta{
	protected String animalia;
	protected String kolore;
	protected int zenbakia;
	protected Boolean errekurrentea;
	protected Ordenatu ord;
	protected Bota bota; 
	public KartaAnimali(String kolorea,int zenbakia) {
		this.kolore 		= null;
		this.zenbakia 		= zenbakia;
		this.errekurrentea 	= false;
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
	public boolean errekurtsiboaDa() {
		return this.errekurrentea;
	}
}