package primer_tema;

public class ExcursionAventura extends Excursion{
private Dificultad dificultad;

public ExcursionAventura(String codigo, Destino estado, int num_part, int distancia, int duracionexcur,
		Dificultad dificultad) {
	super(codigo, estado, num_part, distancia, duracionexcur);
	this.dificultad = dificultad;
}

public double calcularPrecio() {
	if (dificultad==dificultad.MEDIO) {
		return super.calcularPrecio()+150;
	}
	if(dificultad==dificultad.ALTO) {
		return super.calcularPrecio()+300;
	}
	else {
		return super.calcularPrecio();
	}
}

}
