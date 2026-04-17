public class Main {

	public static void main(final String[] args) {
		GestorCubos gestor = new GestorCubos();

		gestor.inicializarCubos();
		gestor.ordenarCubos();
		
		System.out.println("Cubos ordenados por volumen (menor a mayor)");
		for(Cubo c : gestor.getCubos()) {
			System.out.println("Lado: "+c.getLado()+"\nVolumen: "+c.calcularVolumen());
		}
		

		Cubo c1 = new Cubo(3);
		Cubo c2 = new Cubo(5);
		
		System.out.println("¿El cubo 1 cabe exactamente dentro del 2? " + gestor.cabeDentro(c1, c2));
	}
}
