package org.example.generic;

public class MyGeneric<T1, T2> {
    private T1 one;
    private T2 two;

    public MyGeneric(T1 one, T2 two) {
        this.one = one;
        this.two = two;
    }

    public MyGeneric() {
    }

    public String showInfoOne() {
        return one + " " + one.hashCode();
    }

    public String showInfoTwo() {
        return two + " " + two.hashCode();
    }

    public T1 getOne() {
        return one;
    }

    public T2 getTwo() {
        return two;
    }

    public boolean check() {
        return one.equals(two) && one.hashCode() == two.hashCode();
    }
}
