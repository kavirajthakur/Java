import java.util.*;
public class incometaxcalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;// java automatically consider it is zero
        if (income<500000){
            tax = 0;

        }else if(income>=500000 && income<=1000000){
            tax = (int)(income*0.2);//typecast because here 0.2 double value
        }else {
            tax = (int)(income*0.3);
        }
        System.out.println("your tax is " + tax);
    }
    
}
