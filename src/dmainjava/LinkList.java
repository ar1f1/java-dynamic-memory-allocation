package dmainjava;

/**
 *
 * @author surey
 * @param <E>
 */
public class LinkList<E> implements ILinkList<E> {

    private Node<E> first;
    private Node<E> end;
    private static int index;

    @Override
    public int size() {
        return LinkList.index;
    }

    @Override
    public void addFirst(E data) {
        if (this.first == null) {
            first = new Node<>(data);
            end = first;
            index = 1;
        } else {
            Node<E> q = new Node<>(data, first);
            first = q;
            end = q;
            index++;
        }
    }

    @Override
    public void addEnd(E data) {
        if (this.first == null) {
            first = new Node<>(data);
            end = first;
            index = 1;
        } else {
            Node<E> q = first;
            while (q.getNext() != null) {
                q = q.getNext();

            }
            index++;
            q.setNext(new Node<>(data));
            end = q.getNext();

        }
    }

    @Override
    public void add(E data, int index) {
        if (index > LinkList.index) {
            addEnd(data);
        } else {
            Node<E> q = new Node<>();
            q = first;
            for (int i = 1; i < index - 1; i++) {
                q = q.getNext();
            }
            Node<E> p = new Node<>(data);
            p.setNext(q.getNext());
            q.setNext(p);
            LinkList.index++;
        }

    }

    @Override
    public E remove(int index) {
        E data;
        if (index > LinkList.index || index < 1) {
            return null;
        } else if (index == 1) {
            data = first.getData();
            first = first.getNext();
            
        } else {
            Node<E> q = first;
            for (int i = 1; i < index - 1; i++) {
                q = q.getNext();
            }
            data = (E) q.getNext().getData();
            q.setNext(q.getNext().getNext());
           
        }
        LinkList.index--;
        return data;

    }

    @Override
    public E removeFirst() {
        Node<E> p;
        if (first != null) {
            p = first;
            first = first.getNext();
        } else {
            p = first;
        }
        LinkList.index--;
        return p.getData();

    }

    @Override
    public E removeEnd() {
        Node<E> p = first;
        while (p.getNext().getNext() != null) {
            p = p.getNext();
        }
        E data = (E) p.getNext().getData();
        p.setNext(null);
        LinkList.index--;
        return data;

    }

    @Override
    public void clear() {
        first = null;
    }

    @Override
    public void replace(E newData, E oldData) {
        Node<E> p = first;
        while (!oldData.equals(p.getData())) {
            p = p.getNext();

        }
        p.setData(newData);
    }

    @Override
    public E get(int index) {
        if (index == 0 || index > LinkList.index || index < 1) {
            return null;
        }
        Node<E> q = first;
        for (int i = 1; i < index; i++) {
            q = q.getNext();
        }
        return q.getData();
    }

    @Override
    public E getFirst() {
        return first.getData();

    }

    @Override
    public E getEnd() {
        return end.getData();
    }

    @Override
    public int indexOf(E data) {
        Node<E> p = first;
        int n = 1;
        int q = (-1);
        while (n<=LinkList.index) {
            if (p.getData().equals(data)) {
                q = n;
                break;
            }
            p = p.getNext();
            n++;
        }
        return q;

    }

    @Override
    public int indexOf(E data, int index) {
        Node<E> p = first;
        int n = 1;
        int q = (-1);
        while (n<=LinkList.index) {
            
            if (p.getData().equals(data) && n >=index) {
                q = n ;
                break;
            }
            p = p.getNext();
            n++;
        }
        return q;

    }

    @Override
    public int lastIndexOf(E data) {
        Node<E> p = first;
        int n = 1;
        int q = (-1);
        while (n<=LinkList.index) {
            
            if (p.getData().equals(data)) {
                q = n ;
                
            }
            p = p.getNext();
            n++;
        }
        return q;
    }

    @Override
    public boolean inEmpty() {
        return size() == 0;
    }

    @Override
    public void print() {
        Node n = first;
        while (n != null) {
            System.out.println(n.getData());
            n = n.getNext();
        }
    }

    public int getIndex() {
        return LinkList.index;
    }

}
