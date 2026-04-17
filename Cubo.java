package ClaseCubo;

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
	
	/**
	 * Solicita el lado del cubo al usuario
	 */
	public void solicitarLado() {
		boolean valido = false;
		
		while(!valido) {
			String l = JOptionPane.showInputDialog(null, "Introduzca el lado del cubo:", "Lado del cubo",
					JOptionPane.QUESTION_MESSAGE);
			if(l == null) {
				JOptionPane.showMessageDialog(null, "Operación cancelada :(", "Cancelado", JOptionPane.ERROR_MESSAGE);
				return;
			} else if (l.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Introduzca un valor >:(", "Error: Campo vacío", JOptionPane.ERROR_MESSAGE);
			} else {
				try {
					this.lado = Float.parseFloat(l);
					if(this.lado <= 0) {
						JOptionPane.showMessageDialog(null, "No puedes crear un cubo con dimensiones negativas o iguales a cero",
								"Error: Número menor a 1", JOptionPane.ERROR_MESSAGE);
					} else {
						valido = true;
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Eso no es un número -_-", "Error: Valor inesperado", JOptionPane.ERROR_MESSAGE);
				}
		}
		
		}
	}
	
	/**
	 * Muestra el área de la base
	 */
	public void imprimirArea() {
		JOptionPane.showMessageDialog(null, "Área de la base: "+calcularAreaBase(), "Área de la base", JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	 * Muestra el volumen del cubo
	 */
	public void imprimirVolumen() {
		JOptionPane.showMessageDialog(null, "Volumen del cubo: "+calcularVolumen(), "Volumen del cubo", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
