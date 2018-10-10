//Ex 1
public class Mortal {
	private boolean vivo;
	
	public Mortal() {
		vivo = true;
	}
	public void setVivo(boolean vida) {
		vivo = vida;
	}
	public boolean getVivo(){
		return(vivo);
	}	
	public boolean isVivo() {
		return(getVivo());
	}
	public void mata() {
		setVivo(false);
	}
	public String toString() {
		return "Vida: " + vivo;
	}
}