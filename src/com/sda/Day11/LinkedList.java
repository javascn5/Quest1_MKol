package com.sda.Day11;

public class LinkedList {
    Node head;

    public void add(int wartosc){
        Node node = new Node();
        node.wartosc = wartosc;

        if(head == null){
            head = node;
        } else {
            Node n = head;
            while (n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public int size(){
        Node node = head;
        int size = 0;
        while (node != null){
            size++;
            node = node.next;
        }
        return size;
    }

    public void show(){
        Node node = head;

        System.out.print("Podane liczby: ");

        while (node.next != null){
            System.out.print(node.wartosc + "\t");
            node = node.next;
        }
        System.out.println(node.wartosc);
    }

    public void showEven(){
        Node node = head;

        System.out.print("Liczby parzyste: ");

        while (node != null){
            if(node.wartosc % 2 == 0){
                System.out.print(node.wartosc + "\t");
            }
            node = node.next;
        }
        System.out.println();
    }

    public void showNotEven(){
        Node node = head;

        System.out.print("Liczby nieparzyste: ");

        while (node != null){
            if(node.wartosc % 2 != 0){
                System.out.print(node.wartosc + "\t");
            }
            node = node.next;
        }
        System.out.println();
    }
}
