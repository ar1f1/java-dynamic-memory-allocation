
package dmainjava;

/**
 *
 * @author surey
 * @param <E>
 */
public class Queue<E> implements IQueue<E>{
    /*
        implement Queue with LinkList class!
    */
    private final LinkList<E> e = new LinkList<>();
    @Override
    public void clear() {e.clear();}

    @Override
    public boolean isEmpty() {return e.inEmpty();}

    @Override
    public E poll() {return e.removeFirst();}

    @Override
    public void offer(E data) {e.addEnd(data);}

    @Override
    public int getSize() {return e.size();}

    @Override
    public E view() {return e.getFirst();}
    public void print(){
        e.print();
    }
    
}
