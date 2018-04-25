package kartak;
//Un cocodrilo se come a cualquier animal 
//más débil 
//que tenga 
//por delante. Si mientras 
//come se topa con un animal más fuerte o con una cebra, el cocodrilo se detiene de inmediato.
//Los animales comidos van a parar a la carta «ES LO QUE HAY
//El cocodrilo realiza su animalada de forma recurrente en cada turno sucesivo de cada jugador.
public class Krokodilo extends KartaAnimali{

	public Krokodilo(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.errekurrentea=true;
	}

	@Override
	public void animaladaBurutu() {
		// TODO Auto-generated method stub
		
	}

}
