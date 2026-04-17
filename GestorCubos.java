import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GestorCubos {

        /** ArrayList que almacenará la información de los cubos */
        private ArrayList<Cubo> listaCubos = new ArrayList<>();

        public GestorCubos() {
            listaCubos = new ArrayList<>();
        }

        public void inicializarCubos() {
            listaCubos.add(new Cubo(3));
            listaCubos.add(new Cubo(6));
            listaCubos.add(new Cubo(4));
        }

        public void ordenarCubos() {
            Collections.sort(listaCubos, new Comparator<Cubo>() {
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
            return listaCubos;
        }
}
