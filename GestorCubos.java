import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GestorCubos {

    private ArrayList<Cubo> listaCubos;

    public GestorCubos() {
        listaCubos = new ArrayList<>();
    }

    public void inicializarCubos() {
        listaCubos.add(new Cubo(3));
        listaCubos.add(new Cubo(5));
        listaCubos.add(new Cubo(9));
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
        return c1.getLado() <= c2.getLado();
    }

    public ArrayList<Cubo> getListaCubos() {
        return listaCubos;
    }
}
