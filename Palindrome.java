import java.util.*;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0,o=n,r;
        //n=sc.nextInt();
        while(n!=0){
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
       if(rev==o){
           System.out.println("Palindrome");
       }
       else{
           System.out.println("Not Palindrome");
       }
    }
}