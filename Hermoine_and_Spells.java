import java.util.Scanner;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c,l;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a<b && a<c){
            l=a;
        }
        else if(b<a && b<c){
            l=b;
        }
        else{
            l=c;
        }
        int to=(a+b+c-l);
        System.out.println(to);
    }
}