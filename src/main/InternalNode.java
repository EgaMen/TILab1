package main;

import java.util.Objects;


/**
 * Внутренний узел. Имеет два потомка.
 */
public final class InternalNode extends Node {

    public final Node leftChild;  // Не может быть  null

    public final Node rightChild;  // Не может быть null


    public InternalNode(Node left, Node right) {
        Objects.requireNonNull(left);
        Objects.requireNonNull(right);
        leftChild = left;
        rightChild = right;
    }
}
