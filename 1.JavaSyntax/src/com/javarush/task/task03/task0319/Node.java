package com.javarush.task.task03.task0319;

import java.util.*;

public class Node<T> {
    private T val;
    private Node<T> next;
    private Node<T> prev;

    public Node(T val) {
        this.val = val;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public T getVal() {
        return val;
    }
}

class Test{
    public static void main(String[] args) {
        Node<String> node1 = new Node<>("This node one");
        Node<String> node2 = new Node<>("This node two");
        Node<String> node3 = new Node<>("This node three");

        node1.setPrev(null);
        node1.setNext(node2);

        node2.setPrev(node1);
        node2.setNext(node3);

        node2.setPrev(node2);
        node2.setNext(null);


        List<String> list = new LinkedList<>();
        list.add("First element");
        list.add("Second element");
        list.add("Third element");

        for(String obj : list){
            System.out.println(obj);
        }

        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(5);
        integerSet.add(7);
        integerSet.add(3);
        integerSet.add(9);

        for (Integer i: integerSet){
            System.out.println(i);
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");

        for (String str: map.values()){
            System.out.println(str);
        }
    }
}