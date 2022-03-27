package com.stack;

public class Queue<T> {
    LinkedList<T> listObj = new LinkedList<T>();

    public void enqueue(T value) {
        listObj.add(value);
    }

    public void show() {
        listObj.show();
    }

    public Node<T> dequeue() {
        return listObj.pop();

    }
}

