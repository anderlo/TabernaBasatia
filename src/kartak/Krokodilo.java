package kartak;

public class Krokodilo extends KartaAnimali{

	public Krokodilo(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.path = "/Images/Krokodilo"+kolorea+"png";
		this.errekurrentea=true;
	}

}
