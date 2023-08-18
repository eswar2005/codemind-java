import java.util.*;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,i,t,h,tol;
        int sum=0;
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            sum=sum+(i*i);
            }
        t=n*(n+ 1)/2;
        h=t*t;
        tol=h-sum;
        System.out.println(tol);
    }
}