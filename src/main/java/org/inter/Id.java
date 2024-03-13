package org.inter;
import org.analizadorLexico.*;
import org.simbolos.*;

public class Id extends Expr {

    public int desplazamiento;

    public Id(Palabra id, Tipo p, int b) { super(id, p); desplazamiento = b; }

}
