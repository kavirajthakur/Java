public class reversenumber {
    public static void main(String args[]){
        int n = 10122001;
        while(n>0){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n = n/10;
        }
        System.out.println();
    }
}
