
package dmainjava;

/**
 *
 * @author surey
 * @param <E>
 */
public interface IQueue<E> {
    public void clear();
    public boolean isEmpty();
    public E poll();
    public void offer(E data);
    public int getSize();
    public E view();
    
}
