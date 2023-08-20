//Average element
import java.util.*;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int intArr[]= new int[n];
        for(int i=0;i<n;i++){
            intArr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(intArr[i]%2==0)
            sum+=intArr[i];
        }
        int su=0;
        for(int i=0;i<n;i++){
            if(intArr[i]%2!=0)
            su+=intArr[i];
        }
        int ab=sum-su;
        if(ab<0){
            ab=-ab;
        }
        System.out.println(ab);
    }
}