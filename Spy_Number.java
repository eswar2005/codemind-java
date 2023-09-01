import java.util.*;
public class SpyNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r,sum=0;
        int pro=1;
        while(n>0){
            r=n%10;
            sum=sum+r;
            pro=pro*r;
            n/=10;
        }
        if(sum==pro){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }
    }
}