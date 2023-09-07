import java.util.*;
public class Hcf{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c=1;
        for (int i=1;i<=m && i<=n ;i++){
            if(n%i==0 && m%i==0){
                c=i;
            }
        }
        System.out.println(c);
    }
}