package lista3POO;

public class RoboABateria extends RoboAbstrato{

	private long energia;
	
	RoboABateria(String n, int px, int py, short d, long e) {
		super(n, px, py, d);
		energia = e;
	}
	
	//ex1
	public void recarrega(int carga) {
		if (carga > 0)
			energia = energia + carga;
	}
	//ex7
	public long energiaAtual() {
		return energia;
	}
	//ex7
	public void gastaEnergia(long consumo) {
		if (consumo > 0)
			energia = energia - consumo;
	}
	
	//ex5
	public void move(int passos) {
		short dir = direcaoAtual();
		long energiaASerGasta = passos * 10;
		if(dir == 45 || dir ==  135 || dir == 225 || dir == 315)
			energiaASerGasta = passos * 14;
		if (energiaASerGasta <= energia) {
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
		resultado = resultado + "Energia do robô:" + energia;
		return resultado;
	}
	
}
