package lista3POO;
//ex8
public class RoboQDV extends RoboComMemoria {

	RoboQDV(String n, int px, int py, short d) {
		super(n, px, py, d);
	}
	
	public void volta() {
		moveX(+ (nAtual()));
		moveY(+ (lAtual()));
		moveX(- (sAtual()));
		moveY(- (oAtual()));
	}
	
}
