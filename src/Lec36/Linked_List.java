package Lec36;
import java.util.*;
public class Linked_List {
    class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = 0;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public void addfirst(int item){
        Node nn = new Node(item);
        if(size==0){
            head = nn;
            tail = nn;
            size++;
        }else{
            nn.next=head;
            head=nn;
            size++;
        }
    }
    public void addLast(int item){
        if(size==0){
            addfirst(item);
        }else{
            Node nn = new Node(item);
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    public void addIndex(int k,int item){
        if(k==0){
            addfirst(item);
        }else if(k==size-1){
            addLast(item);
        }else{
            Node nn = new Node(item);
            Node prev = getNode(k-1);
            nn.next=prev.next;
            prev.next=nn;
            size++;
        }
    }
    //O(1)
    public int getFirst(){
        return head.val;
    }
    //O(1)
    public int getLast(){
        return tail.val;
    }
    //0(N)
    public int getAtIndex(int k){
        return getNode(k).val;
    }
    private Node getNode(int k){
        Node temp = head;
        for(int i=0;i<k;i++){
            temp = temp.next;
        }
        return temp;
    }
    //0(N)
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    //O(1)
    public int removeFirst(){
        Node temp=head;
        if(size==1){
            head=null;
            tail=null;
            size=0;
        }else{
            head=head.next;
            temp.next=null;
            size--;
        }
        return temp.val;
    }
    public int removeLast(){
        int val = tail.val;
        if(size==1){
            return removeFirst();
        }else{
            Node prev = getNode(size-2);
            prev.next=null;
            tail=prev;
            size--;
        }
        return val;
    }
    public int removeAtIndex(int k){
        if(k==0){
            return removeFirst();
        }else if(k==size-1){
            return removeLast();
        }else{
            Node prev = getNode(k-1);
            Node curr = prev.next;
            prev.next = curr.next;
            curr.next=null;
            size--;
            return curr.val;
        }
    }
    public int size(){
        return size;
    }
}
