/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author myPC
 */
public class LinkedList {
    private LinkNode firstNode;
    private LinkNode lastNode;
    private LinkNode currNode;
    private String name;

    public LinkedList() {               //default constructor
        this("list");
    }

    public LinkedList(String s) {       //normal constructor
        name = s;
        firstNode = lastNode = currNode = null;
    }

    public boolean isEmpty() {
        return (firstNode == null);
    }

    public void insertAtFront(Object insertItem) {
        if (isEmpty())
            firstNode = lastNode = new LinkNode(insertItem);
        else
            firstNode = new LinkNode(insertItem,firstNode);
    }

    public Object getFirst() {
        if (isEmpty())
            return null;
        else {
            currNode = firstNode;
            return currNode.data;
        }
    }

    public Object getLast() {
        if (isEmpty())
            return null;
        else {
            currNode = lastNode;
            return currNode.data;
        }
    }

    public Object getNext() {
        if (currNode!=lastNode) {
            currNode=currNode.next;
            return currNode.data;
        }
        else
            return null;
    }

    public void insertAtBack(Object insertItem) {
        if(isEmpty())
            firstNode = lastNode = new LinkNode(insertItem);
        else
            lastNode = lastNode.next = new LinkNode(insertItem);
    }

    public Object removeFromFront() throws EmptyListException {
        Object removeItem = null;
        if(isEmpty())
            throw new EmptyListException(name);
        removeItem = firstNode.data;

        if(firstNode.equals(lastNode))
            firstNode = lastNode = null;
        else 
            firstNode = firstNode.next;

        return removeItem;
    }

    public Object removeFromBack() throws EmptyListException {
        Object removeItem = null;
        if (isEmpty()) 
            throw new EmptyListException(name);
        removeItem = lastNode.data;
        if(firstNode.equals(lastNode))
            firstNode = lastNode = null;
        else {
            LinkNode current = firstNode;
            while (current.next != lastNode)
                current=current.next;
            lastNode = current;
            current.next = null;

        }
        return removeItem;
    }
}
