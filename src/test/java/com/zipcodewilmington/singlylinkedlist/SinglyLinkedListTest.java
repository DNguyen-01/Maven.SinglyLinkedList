package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest<T extends Comparable> {

   private T data;


    @Test
    public void add() {
        SinglyLinkedList<T> singlyLinkedList = new SinglyLinkedList<T>();
        //given
        Integer expected = 2;
        //when
        singlyLinkedList.add(data);
        singlyLinkedList.add(data);
        //then
        Integer actual = singlyLinkedList.size();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void remove() {
        SinglyLinkedList<T> singlyLinkedList = new SinglyLinkedList<T>();
        //given
        int expected = 1;
        singlyLinkedList.add(data);
        singlyLinkedList.add(data);
        //when
        singlyLinkedList.remove((Integer) data);
        //then
        int actual = singlyLinkedList.size();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void contains() {
        SinglyLinkedList<T> singlyLinkedList = new SinglyLinkedList<T>();
        //given
        //when
        Integer expected = 2;
        singlyLinkedList.add(data);
        singlyLinkedList.add(data);
        Integer actual = singlyLinkedList.size();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void find() {
    }

    @Test
    public void size() {
    }

    @Test
    public void get() {
    }

    @Test
    public void copy() {
    }

    @Test
    public void sort() {
    }



}
