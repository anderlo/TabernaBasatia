package kartak;

public class KartaBerezia extends Karta{
	public KartaBerezia() {
		super();
		this.setPath();
		this.izena = this.getClass().getName().split("kartak.")[1];
	}
	@Override
	protected void setPath() {
		// TODO Auto-generated method stub
		this.path = "/Images/"+this.getClass().getName().split("kartak.")[1]+".png";
	}
	public String getIzena() {
		return this.izena;
	}
}
