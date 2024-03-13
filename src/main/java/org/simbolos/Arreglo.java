package org.simbolos;
import org.analizadorLexico.*;
public class Arreglo extends Tipo {
    public Tipo de;                  // tipo de arreglo
    public int tamanio = 1;             // Numero de elementos
    public Arreglo(int tm, Tipo p) {
        super("[]", Etiqueta.INDEX, tm*p.anchura); tamanio = tm;  de = p;
    }
    /**
     * Retorna el lexema.
     * */
    public String toString() { return "[" + tamanio + "] " + de.toString(); }
}
