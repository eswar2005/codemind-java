import java.util.*;
public class AmicableNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum1=0,sum2=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum1+=i;
            }
        }
        for(int j=1;j<m;j++){
            if(m%j==0){
                sum2+=j;
            }
        }
        if(n==sum2 && m== sum1){
            System.out.println("Amicable");
        }
        else{
            System.out.println("Not Amicable");
        }
    }
}