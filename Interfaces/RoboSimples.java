package lista3POO;

public class RoboSimples extends RoboAbstrato{
	RoboSimples(String n, int px, int py, short d) {
		super(n, px, py, d);
	}
	
	//ex4
	public void move(int passos) {
			if(direcaoAtual()<45 && direcaoAtual()>315)
				moveX(+passos);
			else if(direcaoAtual()<135 && direcaoAtual()>45)
				moveY(+passos);
			else if(direcaoAtual()<225 && direcaoAtual()>135)
				moveX(-passos);
			else if(direcaoAtual()<315 && direcaoAtual()>225)
				moveY(-passos);
	}
}
