package org.analizadorLexico;

public class Token {
    public final int etiqueta; //Guarda el tipo de token
    public Token(int t) { etiqueta = t; } //Recibe un token
    public String toString() {return "" + (char)etiqueta;} //Convierte el char a string
}
