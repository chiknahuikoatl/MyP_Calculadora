package Modelo;

import java.lang.Math;

public class NodoCoseno extends NodoOperador {

    /**
     *
     * @param izq
     * @param der
     */
    public NodoCoseno(CompositeEA der) {
        super(null, der);
        precedence=4;
    }

    /**
     * La evaluación del nodo, calcula el coseno de la evaluación del nodo
     * derecho.
     * @return la evaluación.
     */
    @Override
    public double evalua() {
        return Math.cos(der.evalua());
    }
}
