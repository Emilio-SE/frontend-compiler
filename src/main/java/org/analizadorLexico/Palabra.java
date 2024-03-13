package org.analizadorLexico;

public class Palabra extends Token {

    /**
     * Almacena el valor correspondiente al lexema
     * */
    public String lexema = "";
    /**
     * Guarda el valor del lexema en Palabra y manda tipo de Token a la clase Token.
     * */
    public Palabra(String s, int etiqueta) { super(etiqueta); lexema = s; }
    public String toString() { return lexema; }

    /** Palabra se encarga de almacenar todas aquella palabras específicas que tienen
     *  que ser reconocidas por el compilador
     * */
    public static final Palabra

            and = new Palabra( "&&", Etiqueta.AND ),  or = new Palabra( "||", Etiqueta.OR ),
            eq  = new Palabra( "==", Etiqueta.EQ  ),  ne = new Palabra( "!=", Etiqueta.NE ),
            le  = new Palabra( "<=", Etiqueta.LE  ),  ge = new Palabra( ">=", Etiqueta.GE ),

            minus  = new Palabra( "minus", Etiqueta.MINUS ),
            True   = new Palabra( "true",  Etiqueta.TRUE  ),
            False  = new Palabra( "false", Etiqueta.FALSE ),
            temp   = new Palabra( "t",     Etiqueta.TEMP  );
}

