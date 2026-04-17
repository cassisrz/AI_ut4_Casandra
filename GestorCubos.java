import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GestorCubos {

    public static void main(final String[] args) {

        /** ArrayList que almacenará la información de los cubos */
        private ArrayList<Cubo> Cubos = new ArrayList<>();

        public GestorCubos() {
            Cubos = new Arraylist<>();
        }

        public void inicializarCubos() {
            Cubos.add(new Cubo(3));
            Cubos.add(new Cubo(6));
            Cubos.add(new Cubo(4));
        }

        public void ordenarCubos() {
            Collections.sort(Cubos, new Comparator<Cubo>() {
                @Override
                public int compare(Cubo c1, Cubo c2) {
                    return Float.compare(c1.calcularVolumen(), c2.calcularVolumen());
                }
            });
        }

        public boolean cabeDentro(Cubo c1, Cubo c2) {
            return c1.getLado() < c2.getLado();
        }

        public ArrayList<Cubo> getCubos() {
            return Cubos;
        }
    }
}
