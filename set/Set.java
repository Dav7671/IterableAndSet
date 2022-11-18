package com.company.set;

public interface Set <T>{
    int size();
    boolean isEmpty();
    boolean contains(T el);
    boolean add(T el);
    boolean remove(T el);
    void clear();
}
