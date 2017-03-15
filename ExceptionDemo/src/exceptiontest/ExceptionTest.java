package exceptiontest;

/**
 *
 * @author Phachara
 */
public class ExceptionTest {
    public static int avg(int n1,int n2) throws ArithmeticException{
        //Normally double may not have ArithmeticException In this case suppose it to int
        System.out.println("****** beginning avg ******");
        int result = 0;
        result = sum(n1,n2)/0; //Suppose it to has ArithmeticException
        System.out.println("****** end divide ******");
        return result;
    }
    public static int sum(int n1,int n2){
        System.out.println("****** beginning sum ******");
        int result = 0;
        result = n1+n2;
        System.out.println("****** end sum ******");
        return result;
    }
    public static void main(String[] args) {
        /*
        //java.lang.NullPointerException
        String txt = null;
        System.out.println(txt.length());
        */
        
        /*
        //java.lang.ArithmeticException
        int result = 5/0;
        System.out.println(result);
        */
        System.out.println("****** beginning main ******");
        int n1=20;
        int n2=10;
        int result= avg(n1,n2);
        System.out.println("****** end main ******");
        System.out.println("****** End,Program");
        
    }
    
}
