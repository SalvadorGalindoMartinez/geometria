/**
 * Clase rectángulo
 * @author Salvador Galindo Martínez
 * @version 1.2
 */
public class Rectangulo_SGM extends FiguraGeometrica_SGM {
	private double l1;
	private double l2;
	
	/**
	 * Constructor
	 * @param tipoFigura tipo de figura
	 * @param lG lado grande
	 * @param lP lado pequeño
	 */
	public Rectangulo_SGM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * Método para calcular el area
	 * @return el area
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Método para calcular el perímetro
	 * @return el perímetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
