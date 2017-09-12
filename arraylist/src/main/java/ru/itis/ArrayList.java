package ru.itis;

import java.util.Arrays;
import java.util.List;


public class ArrayList<E> {

    private int size;

    private final int CAPACITY = 16;

    private int capacity;

    private E[] array;

    public ArrayList(){
        array = (E[]) new Object[CAPACITY];
        size=0;
        capacity=16;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean contains(E e) {
        return indexOf(e)!=-1;
    }


    public boolean add(E e) {
        if (size >= capacity) {
            reduceCapacity();
        }
        array[size] = e;
        size++;
        return true;
    }

    public void reduceCapacity() {
        capacity *= 2;
        E[] newArray = (E[]) new Object[capacity];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }


    public void clear() {
        for (E e : array) {
            e = null;
        }
        size=0;
        array = (E[]) new Object[CAPACITY];
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            return array[index];
        }
    }

    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            array[index] = element;
        }
        return element;
    }

    public void add(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            E[] newArray;
            if (size>=capacity) {
               newArray = (E[]) new Object[capacity*2];
            }
            else{
                newArray = (E[]) new Object[capacity];
            }
            for (int i=0; i<index; i++){
                newArray[i] = array[i];
            }
            newArray[index] = element;
            for (int i=index+1; i<newArray.length; i++){
                newArray[i] = array[i-1];
            }
            size++;
            array = newArray;
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException();
        } else {
            E[] newArray = (E[]) new Object[capacity];
            for (int i=0; i<index; i++){
                newArray[i] = array[i];
            }
            for(int i=index+1; i<size; i++){
                newArray[i-1] = array[i];
            }
            size--;
            array = newArray;
        }
    }

    public boolean remove(E e){
        for (int i=0; i< size; i++){
            if (array[i].equals(e)){
                remove(i);
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i=0; i<size; i++){
            if (array[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(E e) {
        int index = -1;
        for (int i=0; i<size; i++){
            if (array[i].equals(e)){
                index=i;
            }
        }
        return index;
    }


    public List<E> subList(int fromIndex, int toIndex) {
        E[] newArray = Arrays.copyOfRange(array,fromIndex,toIndex);
        return Arrays.asList(newArray);
    }
}
