import java.util.*;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        int sq,rem,sum=0;
        sq=s*s;
        while(sq!=0){
        rem=sq%10;
        sum=sum+rem;
        sq=sq/10;
        }
        if(s==sum){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not Neon Number");
        }
    }
}