import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //int b = sc.nextInt(); 
        for (int i = 1; i <=12; i++) { 
            System.out.printf("%d x %d = %d
",a,i,a*i); 
        }
    }
    
}