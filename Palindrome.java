import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q =n;
        int r,rev=0;
        while(n!=0){
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        System.out.println(q==rev ? "True" : "False");
    } 
}