import java.util.*;
public class AdamNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int sn=n*n;
        int r,rev=0;
        while(n!=0){
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        int re,revs=0;
        int revsq = rev*rev;
        while(revsq!=0){
            re=revsq%10;
            revs=revs*10+re;
            revsq/=10;
        }
        System.out.println(sn==revs ? "True" : "False");
    }
}