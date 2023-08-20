import java.util.Scanner;
public class Es{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n,i,rem;
        int sum=0;
        int pro=1;
        n=sc.nextInt();
        while(n!=0){
            rem=n%10;
            sum=sum+rem;
            pro=pro*rem;
            n=n/10;
        }
        System.out.println(pro-sum);
    }
}