import java.util.Scanner;
public class Es{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double c,bill;
        double n=sc.nextDouble();
        if(n<=199){
            c=1.20;
            bill=n*c;
        }
        else if(n>=200 && n<400){
            c=1.40;
            bill=n*c;
        }
        else if(n>=400 && n<600){
            c=1.60;
            bill=n*c;
        }
         else if(n>=600 && n<800){
            c=1.80;
            bill=n*c;
        }
         else{
            c=2.00;
            bill=n*c;
        }
        if(bill>400){
            double sur=bill*0.15;
            System.out.printf("Units Consumed: %.0f
",n);
            System.out.printf("Cost per Unit: %.2f
",c);
            System.out.printf("Bill: %.2f
",bill);
            System.out.printf("Surcharge: %.2f
",sur);
            System.out.printf("Total Amount: %.2f
",bill+sur);
        }
        else{
            double sur=0.00;
            System.out.printf("Units Consumed: %.0f
",n);
            System.out.printf("Cost per Unit: %.2f
",c);
            System.out.printf("Bill: %.2f
",bill);
            System.out.printf("Surcharge: %.2f
",sur);
            System.out.printf("Total Amount: %.2f
",bill+sur);
        }
    }
}