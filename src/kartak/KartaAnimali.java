package kartak;

public class KartaAnimali extends Karta{
	protected String animalia;
	protected String kolore;
	protected int zenbakia;
	protected Boolean errekurrentea;
	public KartaAnimali(String kolorea,int zenbakia) {
		this.kolore 			= null;
		this.zenbakia 		= zenbakia;
		this.errekurrentea 	= false;
		if (kolorea =="Urdina"||kolorea=="Berdea") {
			this.kolore 		= kolorea;
		}
		this.animalia = this.getClass().getName().split("kartak.")[1];
		this.setPath();
	}	
	@Override
	protected void setPath() {
		// TODO Auto-generated method stub
		if (this.kolore != null){
			this.path = "/Images/"+this.animalia+""+this.kolore+".png";
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
