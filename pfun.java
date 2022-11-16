import java.util.*;
public class pfun {
    public static int calculatesum(int num1,int num2){//function bnate waqt jo value hum pass karte hai usko hum bolte 
        // hai ---parameter or formal parameter..
        int sum=num1 + num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a, b);//or jo hum function ko call krte hai or waha pr paranthesis ke andar jo value pass
        //karte hai usko bolte hai -- arguments
        System.out.println("sum is "+sum);
    }
}
