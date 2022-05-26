
package dmainjava;

/**
 *
 * @author surey
 * @param <E>
 */
public interface IStack<E> {
    public void clear();
    public boolean isEmpty();
    public E pop();
    public void push(E data);
    public int getSize();
    public E getTop();
    
    
}
