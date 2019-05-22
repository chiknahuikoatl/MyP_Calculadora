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
     * * La evaluación del nodo, resta la evaluación de los hijos izquierdo y derecho.
     * @return
     */
    @Override
    public double evalua() {
        return Math.cos(der.evalua());
    }
}
