package Lec32;
public class stack {
    private int[] arr;
    private int idx = -1;
    public stack(){
        this(5);
    }
    public stack(int n){
        arr = new int[n];
    }
    //O(1)
    public boolean isEmpty(){
        return idx == -1;
    }
    //O(1)
    public boolean isfull(){
        return size() == arr.length;
    }
    //O(1)
    public void push(int x)throws Exception{
        if(isfull()){
            throw new Exception("Stack is full");

        }
        arr[++idx] = x;
    }
    //O(1)
    public int pop()throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return arr[idx--];
    }
    //O(1)
    public int peek()throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return arr[idx];
    }
    public void Display(){
        for(int i=0;i<=idx;i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println();
    }
    //O(1)
    public int size(){
        return idx+1;
    }
}