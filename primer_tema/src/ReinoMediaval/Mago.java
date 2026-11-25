package ReinoMediaval;

public class Mago extends Personaje{
 	private int hechizos;
	private Ataque ataque;
	public Mago(String nombre, int nivel, int puntosVida, int hechizos, Ataque ataque) {
		super(nombre, nivel, puntosVida);
		this.hechizos = hechizos;
		this.ataque = ataque;
	}
	public double meditar() {
		double cantidad=2;
		return hechizos+=cantidad;
	}
}
