import java.util.Scanner;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        //int b=sc.nextInt();
        int c=0;
        for(int i=1;i<=a;i++){
            if(a%i==0)
            c++;
        }
        if(c>2){
             System.out.print("Not Prime");
        }
        else{
             System.out.print("Prime");
        }
      
    }
}