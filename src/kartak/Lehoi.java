package kartak;

//Si el león jugado no se encuentra en la cola con un miembro de su especie, espanta a 
//todos los monos hacia la carta «ES LO QUE HAY». Seguidamente, se cuela delante de 
//todos los demás animales

//Si ya hay un león en la 
//cola, el león recién jugado 
//va directamente a la carta 
//«ES LO QUE HAY»

public class Lehoi extends KartaAnimali{

	public Lehoi(String kolorea, int zenbakia) {
		
		super(kolorea, zenbakia);
		this.animalia="Lehoi";
		this.setPath();
		// TODO Auto-generated constructor stub
	}

}
