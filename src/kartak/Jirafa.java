package kartak;

//Una jirafa se cuela delante de un animal m�s 
//d�bil si lo tiene directamente delante de ella. 
//De no ser as�, la jirafa se queda donde est�.
//recurrente
public class Jirafa extends KartaAnimali{

	public Jirafa(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.errekurrentea=true;
	}

}
