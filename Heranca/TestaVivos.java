
public class TestaVivos {

	public static void main(String[] args) {
		//testando mortal
		Mortal morty = new Mortal();
		if(morty.isVivo() == true)
			System.out.println("Yep, he is alive");
		morty.mata();
		if(morty.isVivo() == false)
			System.out.println("Yep, he is dead");
		
		//testando gato
		gato Cato = new gato();
		int lifes = 0;
		while(Cato.isVivo() == true) {
			Cato.mata();
			lifes++;
		}
		System.out.println("Dead?-> " + lifes);
		
	}
	
	
	
}
