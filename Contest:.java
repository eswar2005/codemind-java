import java.util.Scanner;
public class Es{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=c*2;
        if(a<=(b+d)){
            System.out.println("Qualify");
        }
        else{
            System.out.println("Not Qualify");
        }
        
    }
}