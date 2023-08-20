import java.util.*;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        //int l=
        int sum=0;
        int pro=1;
        while(s!=0){
        int rem=s%10;
        sum=sum+rem;
        pro=pro*rem;
        s=s/10;
        }
        if(sum==pro){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }
    }
}