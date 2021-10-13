package test2;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {
    private Node first;//栈顶
    private int len;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return len;
    }

    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        len++;
    }

    @SafeVarargs
    public final void push(Item... items){
        for (Item item : items) {
            push(item);
        }
    }
    public Item pop() {
        Item item = first.item;
        first = first.next;
        len--;
        return item;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}