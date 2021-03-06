package Modelo;

import java.lang.Math;

public class NodoSeno extends NodoOperador {

    /**
     *
     * @param izq
     * @param der
     */
    public NodoSeno(CompositeEA der) {
        super(null, der);
        precedence=4;
    }

    /**
    * La evaluación del nodo, calcula el seno de la evaluación del nodo
    * derecho.
    * @return la evaluación.
     */
    @Override
    public double evalua() {
        return Math.sin(der.evalua());
    }
}
