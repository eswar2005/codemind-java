import java.util.Scanner;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        float sum=0;
        for(int i=a;i<=b;i++){
            sum+=Math.sqrt(i);
        }
        System.out.printf("%.2f",sum);
    }
}