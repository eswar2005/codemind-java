import java.util.Scanner;
public class Es{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,r;
        n=sc.nextInt();
        r= n% 3;
        if(r==0){
            System.out.println("NORMAL");
        }
        else if(r==1){
            System.out.println("HUGE");
        }
        else if(r==2){
            System.out.println("SMALL");
        }
    }
}