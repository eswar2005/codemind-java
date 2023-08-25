import java.util.*;
public class Gcd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,i;
        a = sc.nextInt();
        b = sc.nextInt();
        int h=0;
        for(i=1;i<=a && i<=b ; i++){
            if(a%i==0 && b%i==0){
                h=i;
            }
        }
        System.out.print(h);
    }
}