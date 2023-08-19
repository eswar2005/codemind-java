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
        for(int v :intArr){
            if(v%2!=0){
                sum+=v;
            }
        }
        System.out.println(sum);
    }
}