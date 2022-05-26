
package dmainjava;

/**
 *
 * @author surey
 * @param <S>
 */
public interface ILinkList<S> {
    public int size();
    public void addFirst(S data);
    public void addEnd(S data);
    public void add(S data, int index);
    public S remove(int index);
    public S removeFirst();
    public S removeEnd();
    public void clear();
    public void replace(S data1, S data2);
    public S get(int index);
    public S getFirst();
    public S getEnd();
    public int indexOf(S data);
    public int indexOf(S data, int index);
    public int lastIndexOf(S data);
    public boolean inEmpty();
    public void print();
    
}
