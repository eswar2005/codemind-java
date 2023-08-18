import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int pro=1;
        for(int i=1;i<=x;i++){
            pro=pro*i;
        }
        System.out.print(pro);
    }
}