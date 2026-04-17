import javax.swing.JOptionPane;

/**
 * Clase que representa un cubo y permite calcular el área base y volumen de éste
 */
public class Cubo {

	private float lado;
	
	/**
	 * Constructor del lado del cubo
	 * @param lado valor del lado
	 */
	public Cubo(float lado) {
		this.lado = lado;
	}

	/**
	 * Obtiene el valor de lado
	 * @return lado del cubo
	 */
	public float getLado() {
		return lado;
	}

	/**
	 * Modifica el vlaor de lado
	 * @param lado nuevo valor de lado
	 */
	public void setLado(float lado) {
		this.lado = lado;
	}
	
	/**
	 * Calcula el área de la base del cubo
	 * @return area de la base
	 */
	public float calcularAreaBase() {
		return lado * lado;
	}
	
	/**
	 * Calcula el volumen del cubo
	 * @return volumen del cubo
	 */
	public float calcularVolumen() {
		return lado * lado * lado;
	}
	
}
