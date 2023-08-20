import java.util.Scanner;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a+ 1;i<b;i++){
            System.out.println(i + " "+i*i + " "+ i*i*i);
        }
    }
}