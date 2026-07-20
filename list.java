 /*import java.util.*;
class List{
    public static class  Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        }
        public Node head;
        public  Node tail ;
        public static void main(String[] args) {
       
        
}
}

*/
/* 
import java.util.*;

class List {

    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    // Count the length of linked list
    public int countLength() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Get middle node
    public Node getMiddleNode() {
        int length = countLength();
        int middleIndex = length / 2;

        Node temp = head;
        for (int i = 0; i < middleIndex; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Add a new node after the middle node
    public void addMiddle(int data) {
        Node temp = getMiddleNode();
        Node newNode = new Node(data);

        newNode.next = temp.next;
        temp.next = newNode;
    }
      // Remove first 

      public void Remove(){
        Node temp = 
      }
    // Print linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        List ll = new List();
        ll.head = new Node(10);
        ll.head.next = new Node(20);
        ll.head.next.next = new Node(30);

        System.out.print("Original List: ");
        ll.printList();

        ll.addMiddle(99);

        System.out.print("After Adding 99 in Middle: ");
        ll.printList();
    }
}
 */

/*
 import java.util.*;
    class list{
     public static class node {
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
     }
     public node head;
     public node tail;
     public void addFirst(int data){
        node newNode= new node(data);
        if(head==null){
            head=tail=newNode;
        }
        else{
            newNode.next=head;
            head= newNode;
        }
        
        
        }
        public void printlist(){
            node temp = head;
            while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
            }
            System.out.println("null");
        }
        public int countLength() {
        int count = 0;
        node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public int search(int value, int size){
        node temp=head;
        for(int i=0;i<size;i++){
        if(temp.data==value){
            return i;
        }
        else{
            temp=temp.next;
        }
        }  
         return -1;
    }
                public static void main(String[] args) {
            list ll = new list();
            ll.addFirst(34);
            ll.addFirst(44);
            ll.addFirst(5);
            ll.addFirst(66);
            ll.addFirst(177);
            ll.printlist();
            int value=34;
            int size= ll.countLength();
            System.out.print("searched element is at index " + ll.search(value, size));
            
        }
     }
         */

         /* 
     import java.util.*;
     class list{
        public static class node {  // node creation
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
     }
     public node head;
     public node tail;
     public void printlist(){    // print linkedlist
            node temp = head;
            while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
            }
            System.out.println("null");
        }
        public void deleteNthfromEnd(int n){
            int size=0;
            node temp=head;
            while(temp!=null){
                temp=temp.next;
                size++;
            }
            if(n==size){
                head= head.next;
                return;
            }
            int i=1;
            int toFind=size-n;
            node x= head;
            while(i<toFind){
                x=x.next;
                i++;
            }
            x.next=x.next.next;
            return;
        }


      public static void main(String[] args) {
        list ll = new list();
        ll.head= new node(10);
        ll.head.next= new node(20);
        ll.head.next.next= new node(30);
        ll.head.next.next.next= new node(40);
        ll.head.next.next.next.next= new node(50);
        System.out.print("node before deleting is " );
        ll.printlist();
         System.out.print("node after deleting is " );
         ll.deleteNthfromEnd(1);
         ll.printlist();
      }
     } */

     /* 

    import java.util.*;
     class list{
        public static class node {  // node creation
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
     }
     public node head;
     public node tail;
     public void printlist(){    // print linkedlist
            node temp = head;
            while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
            }
            System.out.println("null");
        }
        public void addMiddle(int n){
            node temp=head;
            int i=0;
            while(i<n-1){
                temp=temp.next;
                i++;
            }
            node newnode= new node(30);
            newnode.next=temp.next;
            temp.next=newnode;
        }
     public static void main(String[] args) {
        list ll = new list();
        ll.head= new node(10);
        ll.head.next= new node(20);
        ll.head.next.next= new node(50);
        ll.head.next.next.next= new node(60);
        ll.printlist();
        System.out.println("ll after adding newnode is");
        ll.addMiddle(02);
        ll.printlist();
    }
}
    */
    /* 
    import java.util.*;
    public class list{
       
        public static void ZigZag(LinkedList<Integer> ll){
         ArrayList<Integer> list= new ArrayList<>(ll);
         int start=0;
         int end= list.size()-1;
         while(start<end){
            System.out.print(list.get(start)+"->" + list.get(end));
            System.out.print("->");
            start++;
            end--;
         }
         if(start==end){
            System.out.println( list.get(start));
         }
         
         }
        public static void main(String args[]){
            LinkedList<Integer> ll = new LinkedList<>();
            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            System.out.println(ll);
            ZigZag(ll);

        }
    }
*/

import java.util.*;
public class list{
    public static class Node{
        int data;
        Node next;
        public Node(){
            this.data=data;
            this.next=null;
        }
        public static Node newNode(Node l1 , Node l2){
            Node l3 = new Node();

        }
    }
    public static void main(String[] args) {
        Node l1= new Node(1);
        Node li.next= new Node(3);
        Node li.next.next= new Node(3);
        Node li.next.next.next= new Node(6);
        Node li.next.next.next.next= new Node(11);
        Node li.next.next.next.next.next = new Node(14);

        Node l2= new Node(2);
        Node l2.next= new Node(4);
        Node l2.next.next= new Node(8);
        Node l2.next.next.next= new Node(10);
        newNode(l1,l2);

    }
}
