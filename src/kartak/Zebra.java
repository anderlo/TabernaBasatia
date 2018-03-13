package kartak;

public class Zebra extends KartaAnimali{

	public Zebra(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.path = "/Images/Zebra"+kolorea+"png";
		this.errekurrentea=true;
	}

}
