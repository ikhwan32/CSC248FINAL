
/**
 *
 * @author myPC
 */
public class Queue extends LinkedList{
    public static Object getNext;
    public void enqueue(Object elem){insertAtBack(elem);}
    public Object dequeue(){return removeFromFront();}
    public Object getFront(){return getFirst();}
    public Object getEnd(){return getLast();}
}
