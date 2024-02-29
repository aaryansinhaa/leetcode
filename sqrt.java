public class sqrt {
    public static int mySqrt(int x) {
        if(x>1){
            double temp;
        double sr = x/2;
        do{
            temp = sr;
            sr = (temp + (x/temp))/2;

        }while(temp-sr !=0);
        int sqrt = (int)(sr);
        return sqrt;
        }
        if(x == 1){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int x = 1;
        int sqrt = mySqrt(x);
        System.out.println(sqrt);
    }
}
