package com.stack;

    public class Stack<T> {

        LinkedList<T> listObj = new LinkedList<T>();


        public void push(T value) {
            listObj.addAtStart(value);
        }

        public void show() {
            listObj.show();
        }

        public T peek() {
            return listObj.peek();
        }

        public Node<T> pop() {
            return listObj.pop();

        }

    }
