package com.company.set;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SetImpl<T> implements Set<T> {

    private List<List<T>> container = new ArrayList<>();
    private int size;
    private int bucketSize = 16;

    public SetImpl() {
        for (int i = 0; i < bucketSize; i++) {
            container.add(new LinkedList<>());
        }
    }

    private void scale() {
        this.bucketSize *= 2;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T object) {
        int hashCodeOfElement = object.hashCode();
        List<T> containerOfHashIndex = container.get(hashCodeOfElement % bucketSize);
        return containerOfHashIndex.contains(object);
    }


    public void print() {
        for (List<T> el : container) {
            System.out.println(el + " ");
        }
    }

    @Override
    public boolean add(T object) {
        int hashCodeOfObject = object.hashCode();
        List<T> listOfHashIndex = container.get(hashCodeOfObject % bucketSize);
        if (!listOfHashIndex.contains(object)) {
            if (listOfHashIndex.size() > 4) {
                scale();
                for (List<T> el : container) {
                    if (el != null) {
                        List<T> newListOfHashIndex = container.get(el.hashCode() % bucketSize);
                        newListOfHashIndex.add((T) el);
                    }
                }
            }
            listOfHashIndex.add(object);
            size++;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(T el) {
        return false;
    }

    @Override
    public void clear() {
        this.container = new LinkedList<>();
    }
}
