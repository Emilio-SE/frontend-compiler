package org.inter;
import org.analizadorLexico.*;
import org.simbolos.*;

public class Temp extends Expr {

    static int conteo = 0;
    int numero = 0;

    public Temp(Tipo p) { super(Palabra.temp, p); numero = ++conteo; }

    public String toString() { return "t" + numero; }
}
