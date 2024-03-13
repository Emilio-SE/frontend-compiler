package org.inter;
import org.analizadorLexico.*;
import org.simbolos.*;

public class Unario extends Op {

    public Expr expr;

    public Unario(Token tok, Expr x) {    // handles minus, for ! see Not
        super(tok, null);  expr = x;
        tipo = Tipo.max(Tipo.Int, expr.tipo);
        if (tipo == null ) error("error de tipo");
    }

    public Expr gen() { return new Unario(op, expr.reducir()); }

    public String toString() { return op.toString()+" "+expr.toString(); }
}
