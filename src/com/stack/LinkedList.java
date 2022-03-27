package com.stack;
import java.util.NoSuchElementException;

public class LinkedList<T> {
    Node<T> head;

    public void add(T value) {
        Node<T> newNode = new Node<T>();
        newNode.data = value;
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node<T> last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void show() {
        Node<T> node = head;
        if (node != null) {
            while (node.next != null) {
                System.out.println(node.data);
                node = node.next;
            }
            System.out.println(node.data);
        }
    }

    public void addAtStart(T value) {
        Node<T> newNode = new Node<>();
        newNode.data = value;
        newNode.next = head;
        head = newNode;
    }

    public void addAtIndex(int index, T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;

        if (index == 0) {
            addAtStart(data);
        } else {
            Node<T> node = head;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
        }
    }

    public T peek() {
        final Node<T> firstElement = head;
        return (firstElement == null) ? null : firstElement.data;
    }

    public Node<T> pop() {
        final Node<T> first = head;
        if (first == null)
            throw new NoSuchElementException();

        Node<T> removedItem = first;
        Node<T> newHead = first.next;
        head = newHead;
        return removedItem;
    }

}