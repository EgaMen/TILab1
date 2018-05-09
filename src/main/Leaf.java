package main;



/**
 * Узел листа в кодовом дереве. Символьное значение.
 */
public final class Leaf extends Node {

    public final int symbol;  // Всегда положителен



    public Leaf(int sym) {
        if (sym < 0)
            throw new IllegalArgumentException("Symbol value must bbee non-negative");
        symbol = sym;
    }

}