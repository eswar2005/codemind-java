import java.util.*;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int intArr[]= new int[n];
        for(int i=0;i<n;i++){
            intArr[i]=sc.nextInt();
        }
        float sum=0;
        for(int i=0;i<n;i++){
            sum+=intArr[i];
        }
        float  t=sum/n;
        System.out.printf("%.2f",t);
    }
}