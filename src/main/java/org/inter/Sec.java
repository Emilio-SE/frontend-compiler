package org.inter;

public class Sec extends Instr {

    Instr Instr1; Instr Instr2;

    public Sec(Instr s1, Instr s2) { Instr1 = s1; Instr2 = s2; }

    public void gen(int b, int a) {
        if ( Instr1 == Instr.Null ) Instr2.gen(b, a);
        else if ( Instr2 == Instr.Null ) Instr1.gen(b, a);
        else {
            int etiqueta = nuevaEtiqueta();
            Instr1.gen(b,etiqueta);
            emitirEtiqueta(etiqueta);
            Instr2.gen(etiqueta,a);
        }
    }
}
