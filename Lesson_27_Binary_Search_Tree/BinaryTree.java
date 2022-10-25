package Lesson_27_Binary_Search_Tree;

public interface BinaryTree<T> {
    boolean isEmpty();
    void add(T data);
    Node<T> findMin(Node<T> root);
    T findMax();
    void delete(T data);
    boolean contains(T data);
}
