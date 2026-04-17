/**
 * Programa que incrementa un valor hasta que el resultado
 * sea igual o mayor a 100
 */

public class Main {
	/**
	 * Método principal del programa
	 * 
	 * Realiza un bucle que incrementa un valor de total
	 * en cada iteración hasta llegar a 100 o más.
	 * 
	 * @param args
	 */
	public static void main(final String[] args) {
		/** Resultado final del proceso */
		@SuppressWarnings("unused")
		int resultado = 0;
		/** Número base usado para calcular incrementos */
		int numBase = 15;
		/** Incremento calculado en cada iteración */
		int incremento = 20;
		/** Variable que acumula el valor total */
		int total = 0;
		do {
			incremento = 10 + numBase;
			total = total + incremento;
			total++;
			if (total < 10) {
				resultado = 15;	
				total = total - 1;
			} else {
				resultado = 10;
				total = total - 1;
			}
			int copiaTotal;
			copiaTotal = total;
			resultado = copiaTotal;
		} while (total < 100);
	}
}
