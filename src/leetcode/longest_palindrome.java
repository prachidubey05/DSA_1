package leetcode;

public class longest_palindrome {
    static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {
        int[] count = new int[128]; //ascii characters
        for(char c : s.toCharArray()){
            count[c]++;
        }
        int length = 0;
        for(int c : count){
            length+=(c/2)*2;
        }
        if(length<s.length()){
            length+=1;
        }
        return length;
    }

}
