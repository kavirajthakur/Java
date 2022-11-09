import java.util.*;
public class billcost {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pen =sc.nextFloat();
        float pencil =sc.nextFloat();
        float eraser = sc.nextFloat(); 
        float totalcost = pen+pencil+eraser;
        System.out.println(totalcost);
        float newtotalcost = totalcost+(0.18f * totalcost  );
        System.out.println("Total cost including 18% GST"+ newtotalcost);

    }
    
}
