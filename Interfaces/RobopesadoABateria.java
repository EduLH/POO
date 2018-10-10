package lista3POO;

public class RobopesadoABateria extends RoboABateria{
	private float peso;
	
	RobopesadoABateria(String n, int px, int py, short d, long e, float heavy) {
		super(n, px, py, d, e);
		peso = heavy;
	}
	//ex7
	public void move(int passos) {
		short dir = direcaoAtual();
		long energiaASerGasta = (long) (passos * 10 * (1.4 * peso));
		if(dir == 45 || dir ==  135 || dir == 225 || dir == 315)
			energiaASerGasta = (long) (passos * 14 * (1.4 * peso));
		if (energiaASerGasta <= energiaAtual()) {
			switch (direcaoAtual()) {
				case 0:
					moveX(+passos);
					break;
				case 45:
					moveX(+passos);
					moveY(+passos);
					break;
				case 90:
					moveY(+passos);
					break;
				case 135:
					moveY(+passos);
					moveX(-passos);
					break;
				case 180:
					moveX(-passos);
					break;
				case 225:
					moveX(-passos);
					moveY(-passos);
					break;
				case 270:
					moveY(-passos);
					break;
				case 315:
					moveY(-passos);
					moveX(+passos);
					break;
			}
			gastaEnergia(energiaASerGasta);
		}
	}
	
	public String toString() {
		String resultado = super.toString() + "\n";
		resultado = resultado + "Peso do robô:" + peso;
		return resultado;
	}
	
}
