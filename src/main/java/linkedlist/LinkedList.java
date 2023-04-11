package src.main.java.linkedlist;

public class LinkedList {
    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int data){
        Node node = new Node(data);
        head = node;
        tail = node;
        length = 1;
    }

    //print all elements
    public void printAllElements(){
        Node temp = head;
        Node last = head;
        if(length == 0){
            return;
        }
        System.out.print("[");
        while(temp  != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("]");
    }
    //append
    public void append(int data){
        Node newNode = new Node(data);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    //deleteFirst
    public void deleteFirst(){
        if(length == 0) {
            System.out.println("Nothing to delete, list is empty");
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
    }
    //deleteLast
    public void deleteLast(){
        if(length == 0){
            System.out.println("Nothing to delete, list is empty");
            return;
        }
        if(length ==1){
            head = tail = null;
            length = 0;
            return;
        }else {
            Node temp = head;
            while(temp.next != null){
                if(temp.next == tail){
                    tail = temp;
                    tail.next = null;
                    length--;
                    return;
                }
                temp = temp.next;
            }
        }
    }

    //prepend
    public void prepend(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        length++;
    }

    //reverse
    public void reverse(){

    }
}
