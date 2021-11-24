package com.zipcodewilmington.singlylinkedlist;

public class Node {

    //two attributes

    private Integer data;
    private Node next; //acts a pointer -> pointing to the next node

    public Node(){

    }

    public Node(Integer data, Node next){

        this.data = data;
        this.next = next;

    }

    public Node(Integer data){

        this.data = data;

    }



}
