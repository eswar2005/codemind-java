import java.util.*;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n%10==0){
            System.out.println(n/10);
        }
        else if(n%5==0){
            System.out.println((n/10)+ 1);
        }
        else{
           System.out.println(-1); 
        }
    }
}