//Average element
import java.util.*;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int c=0;
        int intArr[]= new int[n];
        for(int i=0;i<n;i++){
            intArr[i]=sc.nextInt();
            c++;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=intArr[i];
        }
        int t=sum/n;
        for(int i=0;i<n;i++){
            if(t==intArr[i]){
                System.out.print("True");
                c=c- 10;
                break;
            }}
            if(c==n){
                System.out.print("False");
       }
    }
}