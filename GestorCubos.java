package ClaseCubo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GestorCubos {

    public static void main(final String[] args) {

        /** ArrayList que almacenará la información de los cubos */
        ArrayList<Cubo> cubos = new ArrayList<>();

        /** Bucle para pedir la info de todos los cubos */
        for (int i = 0; i < 3; i++) {
            Cubo cubo = new Cubo(0);
            cubo.solicitarLado();
            cubos.add(cubo);
        }

        /** String resultado para mostrar los resultados */
        String resultado = "Resultados:\n\n";

        for (int i = 0; i < cubos.size(); i++) {
            Cubo c = cubos.get(i);

            resultado += "Cubo " + (i + 1) +
                    "\nLado: " + c.getLado() +
                    "\nÁrea base: " + c.calcularAreaBase() +
                    "\nVolumen: " + c.calcularVolumen() +
                    "\n----------------------\n";
        }

        JOptionPane.showMessageDialog(null, resultado);

        /** Calcula el cubo con mayor volumen */
        Cubo mayor = cubos.get(0);

        for (Cubo c : cubos) {
            if (c.calcularVolumen() > mayor.calcularVolumen()) {
                mayor = c;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Cubo con mayor volumen:\n\n" +
                        "Lado: " + mayor.getLado() +
                        "\nVolumen: " + mayor.calcularVolumen());
    }
}
