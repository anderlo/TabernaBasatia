package kartak;

//Una jirafa se cuela delante de un animal más 
//débil si lo tiene directamente delante de ella. 
//De no ser así, la jirafa se queda donde está.
//recurrente
public class Jirafa extends KartaAnimali{

	public Jirafa(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.errekurrentea=true;
	}

}
