// Java program To calculate
// The Value Of nCr
import java.util.*;
class bincoff {
 
    static int nCr(int n, int r)
    {
        return fact(n) / (fact(r) *
                      fact(n - r));
    }
     
    // Returns factorial of n
    static int fact(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }
     
    // Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(nCr(n, r));
    }
    }
     