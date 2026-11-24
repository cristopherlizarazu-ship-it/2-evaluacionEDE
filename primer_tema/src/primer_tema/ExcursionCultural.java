package primer_tema;

public class ExcursionCultural extends Excursion{
	private boolean estudiantes;

	public ExcursionCultural(String codigo, ExcursionBuceo estado, int num_part, int distancia, int duracionexcur,
			boolean estudiantes) {
		super(codigo, estado, num_part, distancia, duracionexcur);
		this.estudiantes = estudiantes;
	}
}
