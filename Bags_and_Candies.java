import java.util.*;
public class Es{
    public static void main(String[] args){
        int a,b,c,d,e;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=b*c;
        e=a/d;
        if(a%d==0){
            System.out.println(e);
        }
        else{
            System.out.println(e+ 1);
        }
    }
}