package Modelo;

import java.lang.Math;

public class NodoRaiz extends NodoOperador {

    /**
     *
     * @param izq
     * @param der
     */
    public NodoRaiz(CompositeEA der) {
        super(null, der);
        precedence=4;
    }

    /**
    * La evaluación del nodo, calcula la raíz cuadrada de la evaluación del nodo
    * derecho.
    * @return la evaluación.
     */
    @Override
    public double evalua() {
        return Math.sqrt(der.evalua());
    }
}
