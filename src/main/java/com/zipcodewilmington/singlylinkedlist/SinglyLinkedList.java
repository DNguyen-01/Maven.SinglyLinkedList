package com.zipcodewilmington.singlylinkedlist;

import javax.xml.bind.Element;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    private class Node<T> {

        private T data;
        private Node<T> next;

        public Node() {
        }

        public Node(T data, Node<T> next) {

            this.data = data;
            this.next = next;

        }

        public Node(T data) {
            this.data = data;
        }


    }

    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    public void remove(int index) {
        //given the index to remove
        //iterate through the singlylist
        Node<T> currentNode = head, previousNode = null;
        int currentIndex = 0;
        //check if the current node exist
        while (currentNode != null && currentIndex != index) {
            //keeping track of the previous node
            previousNode = currentNode;
            //continuing the iteration
            currentNode = currentNode.next;
            //iterate through the next node
            currentIndex++;
        }
        //remove the index
        if (currentIndex == index) {
            //checking if the previous node is not null
            if (previousNode != null) {
                //then we can add the previous node to the node after
                previousNode.next = currentNode.next;
            }
            //checking that the current node is the head
            if (currentNode == head) {
                //and also if the current node is null
                if (currentNode == null || currentNode.next == null) {
                    //return head as null;
                    head = null;
                } else {
                    //the new head will be the next node
                    head = currentNode.next;
                }
                //current is the tail
            } else if (currentNode == tail) {
                //the tail is the previous node
                tail = previousNode;
            }

        }

    }

    public Boolean contains(T element) {
        //given a T element
        //loop through the list starting from the head
        //each time check if it contains the element
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.data != element) {
                currentNode = currentNode.next;
            } else {
                return true;
            }
        }
        return false;

    }

    public int find(T element) {
        //create indexCounter
        //iterate through the node
        //when you find the element
        //return the index where element is found
        int currentIndex = 0;
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.data != element) {
                currentNode = currentNode.next;
                currentIndex++;
            }
            if (currentNode.data == element) {
                return currentIndex;
            }
        }

        return -1;
    }


    public void size() {

    }

    public void get() {

    }

    public void copy() {

    }

    public void sort() {

    }

}
