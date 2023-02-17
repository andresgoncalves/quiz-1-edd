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
