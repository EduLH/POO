package lista3POO;
//ex6
public class RoboComMemoria extends RoboAbstrato {
	private int N, S, L, O;
	RoboComMemoria(String n, int px, int py, short d) {
		super(n, px, py, d);
		N = 0;
		S = 0;
		L = 0;
		O = 0;
	}
	//ex8
	public int nAtual() {
		return N;
	}
	public int lAtual() {
		return L;
	}
	public int sAtual() {
		return S;
	}
	public int oAtual() {
		return O;
	}
	
	@Override
	public void move(int passos) {
		if(direcaoAtual()<45 && direcaoAtual()>315) {
			moveX(+passos);
			L = L + 1;
		}
		else if(direcaoAtual()<135 && direcaoAtual()>45) {
			moveY(+passos);
			N = N + 1;
		}
		else if(direcaoAtual()<225 && direcaoAtual()>135) {
			moveX(-passos);
			O = O +1;
		}
		else if(direcaoAtual()<315 && direcaoAtual()>225) {
			moveY(-passos);
			S = S + 1;
		}
	}	

	public String toString() {
		String resultado = super.toString() + "\n";
		resultado = resultado + " N:" + N + " L:" + L + " S:" + S + " O:" + O;
		return resultado;
	}
	
	
}
