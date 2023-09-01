import java.util.*;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int r;
        int sum=0;
        while(n>9){
                r=n%10;
                n/=10;
                n=n+r;
        }
            System.out.println(n);
        }
        
    }
