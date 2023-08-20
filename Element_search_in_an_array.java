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
        int a=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a==intArr[i]){
                System.out.print("True");
                c=c- 10;
                break;
            }
        }
            if(c==n){
                System.out.print("False");
            }
        }
    }