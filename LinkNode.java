
/**
 *
 * @author myPC
 */
public class LinkNode {
    Object data;
    LinkNode next;

    LinkNode(Object obj) {
        this( obj,null );
    }

    LinkNode(Object obj, LinkNode nextNode) {
        data = obj;
        next = nextNode;
    }

    Object getObject(){return data;}
    LinkNode getNext(){return next;}
}
