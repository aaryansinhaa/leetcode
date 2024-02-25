public class palindrome {
    public static boolean isPalindrome(int x) {
        int checker = x;
        int r;
        int pal = 0;
        if(x>-1){
        while(x!=0){
            r = (int)(x%10);
            
            pal = pal*10 + r;
            x = x/10;
        }
        if(pal == checker){
            return true;
        }
        }
        return false;
        
    }
    public static void main(String[] args){
        int x = 121;
        boolean answer = isPalindrome(x);
        System.out.print(answer);
    }
}
