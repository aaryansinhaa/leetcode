public class addingStrings{
    static String num1 = "134";
    static String num2 = "44";
    public static String addingString(String num1, String num2){
        char[] new1c = num1.toCharArray();
        char[] new2c = num2.toCharArray();
        //System.err.println(new2c);
        int num1int = 0;
        int num2int = 0;
        for(int i = 0; i< new1c.length; i++){
            char store = new1c[i];
            int digit = store - '0'; 
            num1int = num1int*10 + digit;
        }
        for(int i = 0; i< new2c.length; i++){
            //System.err.println(new2c[i]);
            char store = new2c[i];
            //System.err.println("Store: "+store);
            int digit = store - '0'; 
            //System.err.println("Digit: "+digit);
            
            num2int = num2int*10 + digit;
           // System.err.println("num2int: "+num2int);

        }
        int result = num1int + num2int;
        
        return String.valueOf(result);
    }
    public static void main(String[] args) {
        String answer = addingString(num1, num2);
        System.out.println(answer);
    }
}