package HackerRank.DataStructure.LinkedList;

import java.util.*;

public class LinkedList{
    Node head;

    LinkedList(){
        this.head = null;
    }

    Node insertAtTail(Node head, int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }
        else{
            Node curr = head;

            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
        return head;
    }

    void printLst(Node head){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList lst = new LinkedList();

        for(int i = 0; i < n; i++){
            // int data = Integer.parseInt(sc.nextLine());
            int data = sc.nextInt();
            lst.head = lst.insertAtTail(lst.head, data);
        }

        lst.printLst(lst.head);

        sc.close();
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}