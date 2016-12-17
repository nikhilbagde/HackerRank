package DataStructure.MyDataStructures.Tree;

import DataStructure.MyDataStructures.PositionalLists.Position;

import java.util.TreeMap;

/**
 * Created by Nikhi on 12/16/2016 4:33 AM.
 */
public interface MyBinaryTree<E> extends MyTree<E> {
    Position<E> right(Position<E> p) throws IllegalArgumentException;
    Position<E> left(Position<E> p) throws IllegalArgumentException;
    Position<E> sublings(Position<E> p) throws IllegalArgumentException;
}
