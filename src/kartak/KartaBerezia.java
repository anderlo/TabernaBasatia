package kartak;

public class KartaBerezia extends Karta{
	public KartaBerezia() {
		super();
		this.setPath();
	}
	@Override
	protected void setPath() {
		// TODO Auto-generated method stub
		this.path = "/Images/"+this.getClass().getName().split("kartak.")[1]+".png";
	}
}
