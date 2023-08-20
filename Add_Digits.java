import java.util.Scanner;
public class Es{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n,i,rem;
        n=sc.nextInt();
        while(n>9){
            rem=n%10;
            n=n/10;
            n=n+rem;
        }
        System.out.println(n);
    }
}