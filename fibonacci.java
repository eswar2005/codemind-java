import java.util.*;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,c,a,b;
        a=0;
        b=1;
        n = sc.nextInt();
        for( int i=0;i <n; i++){
            c=a+b;
            System.out.print(a + " ");
            a=b;
            b=c;
        }
    }
}