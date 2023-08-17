import java.util.*;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=21 - a - b;
        if(c>=0 && c<=10 ){
            System.out.println(c);
        }
        else{
            System.out.println(-1);
        }
    }
}