package Recursion;

public class power {
    static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(power(a,b));
    }
    public static int power(int a,int b){
        if(b==0) return 1;
        int p = power(a,b-1);
        return a*p;
    }
}
