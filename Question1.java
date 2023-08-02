import java.util.Scanner;

interface Shape{
   
   
   void input();
   void calculate();
   void display();
}

class Rectangle implements Shape{
   private float length;
   private float breadth;
   private float area;
   private float perimeter;
   @Override
   public void input() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the Length of the rectangle:");
      this.length = scanner.nextFloat();
      System.out.println("Enter the Breadth of the rectangle:");
      this.breadth = scanner.nextFloat();
      scanner.close();
   }

   @Override
   public void calculate() {
      area =length*breadth;
      perimeter=length+breadth;

   }

   @Override
   public void display() {
      System.out.println("Area is: " +area+" Perimeter is: "+perimeter);
   }

}

class Circle implements Shape{

   @Override
   public void input() {
      
      throw new UnsupportedOperationException("Unimplemented method 'input'");
   }

   @Override
   public void calculate() {
     
      throw new UnsupportedOperationException("Unimplemented method 'calculate'");
   }

   @Override
   public void display() {
      
      throw new UnsupportedOperationException("Unimplemented method 'display'");
   }

}


public class Question1{ 
    public static void main(String[] args) 
    {
           Shape s1=  new Rectangle();
           s1.input();
           s1.calculate();
           s1.display();

    }



}