import java.util.*;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,r;
        n=sc.nextInt();
        r = n/4;
        if(n%4==0){
            System.out.println(r);
        }
        else{
           System.out.println(r+ 1);
        }
    }
}