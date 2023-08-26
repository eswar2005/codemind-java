import java.util.*;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,rev=0,r;
        n=sc.nextInt();
        int q=n;
        while(n!=0){
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        if(q==rev){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        } 
        
    }
}