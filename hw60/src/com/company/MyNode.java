package com.company;

public class MyNode<E> {
    E item;
    MyNode<E> prev;
    MyNode<E> next;

    MyNode(MyNode<E> prev, E item, MyNode<E> next) {
        this.prev = prev;
        this.next = next;
        this.item = item;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public MyNode<E> getPrev() {
        return prev;
    }

    public void setPrev(MyNode<E> prev) {
        this.prev = prev;
    }

    public MyNode<E> getNext() {
        return next;
    }

    public void setNext(MyNode<E> next) {
        this.next = next;
    }
}
