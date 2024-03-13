package org.analizadorLexico;

public class Num extends Token { //Representa especificamente un Token numerico
    public final int valor; //Guarda el valor del token
    // Guarda el valor del Token en la clase Num pero
    // también manda el valor del referente al Token a la
    // clase Token.
    public Num(int v) {super(Etiqueta.NUM); valor = v; }
    //Método toString para convertir el valor a string
    public String toString() { return "" + valor; }
}
