package org.inter;
import org.simbolos.*;

public class Else extends Instr {

    Expr expr; Instr instr1, instr2;

    public Else(Expr x, Instr s1, Instr s2) {
        expr = x; instr1 = s1; instr2 = s2;
        if( expr.tipo != Tipo.Bool ) expr.error("se requiere booleano en if");
    }
    public void gen(int b, int a) {
        int etiqueta1 = nuevaEtiqueta();   // etiqueta1 for instr1
        int etiqueta2 = nuevaEtiqueta();   // etiqueta2 for instr2
        expr.salto(0,etiqueta2);    // fall through to instr1 on true
        emitirEtiqueta(etiqueta1); instr1.gen(etiqueta1, a); emitir("goto L" + a);
        emitirEtiqueta(etiqueta2); instr2.gen(etiqueta2, a);
    }
}
