package kartak;

//Un hipop�tamo embiste hacia la puerta. Sin embargo, no puede colarse delante de un 
//miembro de su propia especie, de animales m�s fuertes (leones) o de las cebras (consultad 
//�La cebra�).

//El hipop�tamo realiza su animalada de forma recurrente en cada turno sucesivo de 
//cada jugador
public class Hipopotamo extends KartaAnimali{

	public Hipopotamo(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.errekurrentea=true;
	}

}
