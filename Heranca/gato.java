//Ex 2
public class gato extends Mortal{
	private int vidas;
	
	public gato() {
		super();
		vidas = 7;
	}
	public void setGato(int lifes) {
		vidas = lifes;
	}
	public int getGato(){
		return(vidas);
	}
	//overwrite  Mata
	public void mata() {
		if(vidas>0) 
			vidas--;
		else 
			setVivo(false);
	}	
	//overwrite  toString
	public String toString() {
		return "Vidas: " + vidas + super.toString();
	}
}
