package org.inter;

public class Instr extends Nodo {

    public Instr() { }

    public static Instr Null = new Instr();

    public void gen(int b, int a) {} // called with labels begin and despues

    int despues = 0;                   // saves label despues
    public static Instr Circundante = Instr.Null;  // used for break stmts
}
