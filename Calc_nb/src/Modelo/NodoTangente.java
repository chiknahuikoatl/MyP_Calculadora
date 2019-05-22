package Modelo;

import java.lang.Math;

public class NodoTangente extends NodoOperador {

    /**
     *
     * @param izq
     * @param der
     */
    public NodoTangente(CompositeEA der) {
        super(null, der);
        precedence=4;
    }

    /**
     * * La evaluación del nodo, calcula la tangente del nodo derecho.
     * @return la evaluación.
     */
    @Override
    public double evalua() {
        double d = der.evalua();
        if (Double.compare(Math.PI, d) == Math.PI) {
            throw new ArithmeticException("Error: Tangente no definida.");
        }
        return Math.tan(d);
    }
}
