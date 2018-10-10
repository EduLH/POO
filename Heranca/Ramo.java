//Ex 3
public class Ramo extends Mortal{
	private Ramo Esq;
	private Ramo Dir;
	
	public Ramo() {
		super();
		Esq = null;
		Dir = null;
	}
	public void setRamo(Ramo Esque, Ramo Direi){
		Esq = Esque;
		Dir = Direi;
	}
	//overwrite 	
	public void mata(Ramo galio) {
		if(galio.Esq != null)
			mata(galio.Esq);
		if(galio.Dir != null)
			mata(galio.Dir);
		setVivo(false);
	}
	public String toString() {
		String dir;
		String esq;
		if(Dir != null)
			dir = "True";
		else
			dir = "False"; 
		if(Esq != null)
			esq = "True";
		else
			esq = "False";
		
		return "Galio dir: " + dir + ", Galio esq: " + esq + " " + super.toString(); 
	}
}
