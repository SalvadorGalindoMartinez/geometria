/**
 * Clase rect�ngulo
 * @author Salvador Galindo Mart�nez
 * @version 1.2
 */
public class Rectangulo_SGM extends FiguraGeometrica_SGM {
	private double l1;
	private double l2;
	
	/**
	 * Constructor
	 * @param tipoFigura tipo de figura
	 * @param lG lado grande
	 * @param lP lado peque�o
	 */
	public Rectangulo_SGM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * M�todo para calcular el area
	 * @return el area
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * M�todo para calcular el per�metro
	 * @return el per�metro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
