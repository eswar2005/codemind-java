import java.util.*;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,r,rev=0;
        n = sc.nextInt();
        while(n!=0){
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        System.out.println(rev);
    }
}