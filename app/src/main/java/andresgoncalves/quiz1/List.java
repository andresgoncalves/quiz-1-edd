package andresgoncalves.quiz1;

import java.util.Objects;

/**
 *
 * @author Andres
 */
public class List<T> {
    private Node<T> first, last;
    private int size;
    
    public void append(T value) {
        Node<T> node = new Node<T>(value);
        if(last == null) {
            first = last = node;
        }
        else {
            node.setPrev(last);
            last.setNext(node);
            last = node;
        }
        size += 1;
    }
    
    public void insertBefore(T value, Node<T> ref) {
        Node<T> node = new Node<T>(value);
        if(ref.getPrev() != null) {
            ref.getPrev().setNext(node);
            node.setPrev(ref.getPrev());
        }
        else {
            first = node;
        }
        node.setNext(ref);
        ref.setPrev(node);
        size += 1;
    }
    
    public void insertAfter(T value, Node<T> ref) {
        Node<T> node = new Node<T>(value);
        if(ref.getNext() != null) {
            ref.getNext().setPrev(node);
            node.setNext(ref.getNext());
        }
        else {
            last = node;
        }
        node.setPrev(ref);
        ref.setNext(node);
        size += 1;
    }
    
    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
}
