import java.util.*;
public class Es{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int intArr[]=new int[n];
        for(int i=0;i<n;i++){
           intArr[i]=sc.nextInt(); 
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum+=intArr[i];
            }
        }
        System.out.println(sum);
    }
}