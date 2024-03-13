package org.inter;
import org.simbolos.*;

public class If extends Instr {

    Expr expr; Instr instr;

    public If(Expr x, Instr s) {
        expr = x;  instr = s;
        if( expr.tipo != Tipo.Bool ) expr.error("se requiere booleano en if");
    }

    public void gen(int b, int a) {
        int etiqueta = nuevaEtiqueta(); // etiqueta for the code for instr
        expr.salto(0, a);     // fall through on true, goto a on false
        emitirEtiqueta(etiqueta); instr.gen(etiqueta, a);
    }
}
