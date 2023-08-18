import java.util.*;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m,i;
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<=m;i++){
            if(i%2==0){
            System.out.print(i + " ");
            }
        }
    }
}