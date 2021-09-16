package com.company;

import java.util.*;
import java.util.function.Consumer;

public class MyLinkedList<T> {
    private T value;

    transient MyNode<T> first;
    transient MyNode<T> last;
    transient int size;

    MyNode<T> node(int index) {
        if (index < (size >> 1)) {
            MyNode<T> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            MyNode<T> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }
    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
    public T get(int index) {
        checkElementIndex(index);
        return node(index).item;
    }

    //=============================================

    transient int modCount = 0;
    void linkLast(T t) {
        final MyNode<T> l = last;
        final MyNode<T> newNode = new MyNode<T>(l, t, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }

    public boolean add(T t) {
        linkLast(t);
        return true;
    }

    //=================================================

    public ListIterator<T> listIterator(int index) {
        checkPositionIndex(index);
        return new ListItr(index);
    }

    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    void linkBefore(T e, MyNode<T> succ) {
        final MyNode<T> pred = succ.prev;
        final MyNode<T> newNode = new MyNode<T>(pred, e, succ);
        succ.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
        modCount++;
    }

    void unlink(MyNode<T> x) {
        final T element = x.item;
        final MyNode<T> next = x.next;
        final MyNode<T> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        modCount++;
    }

    private class ListItr implements ListIterator<T> {
        private MyNode<T> lastReturned;
        private MyNode<T> next;
        private int nextIndex;
        private int expectedModCount = modCount;

        ListItr(int index) {
            next = (index == size) ? null : node(index);
            nextIndex = index;
        }

        public boolean hasNext() {
            return nextIndex < size;
        }

        public T next() {
            checkForComodification();
            if (!hasNext())
                throw new NoSuchElementException();

            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.item;
        }

        public boolean hasPrevious() {
            return nextIndex > 0;
        }

        public T previous() {
            checkForComodification();
            if (!hasPrevious())
                throw new NoSuchElementException();

            lastReturned = next = (next == null) ? last : next.prev;
            nextIndex--;
            return lastReturned.item;
        }

        public int nextIndex() {
            return nextIndex;
        }

        public int previousIndex() {
            return nextIndex - 1;
        }

        public void remove() {
            checkForComodification();
            if (lastReturned == null)
                throw new IllegalStateException();

            MyNode<T> lastNext = lastReturned.next;
            unlink(lastReturned);
            if (next == lastReturned)
                next = lastNext;
            else
                nextIndex--;
            lastReturned = null;
            expectedModCount++;
        }

        public void set(T t) {
            if (lastReturned == null)
                throw new IllegalStateException();
            checkForComodification();
            lastReturned.item = t;
        }

        public void add(T t) {
            checkForComodification();
            lastReturned = null;
            if (next == null)
                linkLast(t);
            else
                linkBefore(t, next);
            nextIndex++;
            expectedModCount++;
        }

        public void forEachRemaining(Consumer<? super T> action) {
            Objects.requireNonNull(action);
            while (modCount == expectedModCount && nextIndex < size) {
                action.accept(next.item);
                lastReturned = next;
                next = next.next;
                nextIndex++;
            }
            checkForComodification();
        }

        final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }

}
