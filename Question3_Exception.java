import java.util.Scanner;

public class Question3_Exception {
    public static void main(String[] args) {
        try{
            perform();
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }catch(Exception e){
            System.out.println("Some Other Exception");
        }

        System.out.println("Program Ended");
         
    }

   public static void perform() throws ArithmeticException{
      Scanner sc = new Scanner(System.in);
         System.out.println("Enter a  number::");
         int x = sc.nextInt();
           sc.close();
         if(x<0){
 
            throw new ArithmeticException("Negative  Number is Given As Input");
         }
       
   }

}


