import java.util.*;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a<=(b*c)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}