
package dmainjava;

/**
 *
 * @author surey
 * @param <E>
 */
public class Stack<E> implements IStack<E>{
    /*
        Can implement Static method with an object from LinkList class,
        But there I want to show how to stack work
    */
    private Node<E> top;
    private static int size;
    
//    -----------------Constractor
    public Stack(){
        clear();
    }

    @Override
    public void clear()
    {
        top = null;
        size = 0;    
    }

    @Override
    public boolean isEmpty() 
    {
        return (top == null);        
    }

    @Override
    public E pop() 
    {
        if(isEmpty())
            return null;
        E element = top.getData();
        top = top.getNext();
        Stack.size++;
        return element;
    }

    @Override
    public void push(E data) 
    {
        top = new Node<>(data,top);
        Stack.size++;
    }

    @Override
    public int getSize()
    {
        return Stack.size; //TODo
    }

    @Override
    public E getTop()
    {
        if(isEmpty())
            return null;
        return top.getData();
    }
    
}
