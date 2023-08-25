import java.util.*;
public class Last{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y;
        y= n%100;
        System.out.printf("%02d",y);
    }
}