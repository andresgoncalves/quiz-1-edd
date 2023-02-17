package andresgoncalves.quiz1;

/**
 *
 * @author Andres
 */
public class Node<T> {
    private Node<T> prev, next;
    private T value;

    public Node(T value) {
        this.value = value;
    }
    
    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
    
}
