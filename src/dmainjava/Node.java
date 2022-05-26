
package dmainjava;

/**
 *
 * @author surey
 */
public class Node<T> {
    private T data;
    private Node next;
    
//    ----------------Constractors
    public Node(){
        this.data = null;
        this.next = null;
    }
    public Node(T data){
        this.data = data;
        this.next = null;
    }
    public Node(T data, Node next){
        this.data = data;
        this.next = next;
    }
//    -----------------Setter and Getter Methos
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
