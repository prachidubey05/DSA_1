package Recursion;
import java.util.*;
public class first_occurence {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = {2,4,6,3,6,8,9};
        int item = 9;
        System.out.println(Occ(arr,item,0));
    }
    public static int Occ(int[]arr , int item , int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==item) return i;
        return Occ(arr,item,i+1);
    }
}
