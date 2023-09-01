import java.util.*;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int q=n*n;
        int r,sum=0;
        while(q>0){
            r=q%10;
            sum=sum+r;
            q/=10;
        }
        if(n==sum){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not Neon Number");
        }
    }
}