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
class Triangle implements Shape{
   private float height;
   private float base;
   private float side1;
   private float side2;
   private float area;
   private float perimeter;
   @Override
   public void input() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the Height of the rectangle:");
      this.height = scanner.nextFloat();
      System.out.println("Enter the Base(side3) of the rectangle:");
      this.base = scanner.nextFloat();
      System.out.println("Enter one side of the rectangle:");
      this.side1 = scanner.nextFloat();
      System.out.println("Enter anothere side of the rectangle:");
      this.side2 = scanner.nextFloat();
      scanner.close();
   }

   @Override
   public void calculate() {
      area =(float) (0.5*height*base);
      perimeter=base+side1+side2;

   }

   @Override
   public void display() {
      System.out.println("Area is: " +area+" Perimeter is: "+perimeter);
   }

}
class Square implements Shape{
   private float side;
   private float area;
   private float perimeter;
   @Override
   public void input() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the Side of the Square:");
      this.side = scanner.nextFloat();
     
      scanner.close();
   }

   @Override
   public void calculate() {
      area =side*side;
      perimeter=4*side;

   }

   @Override
   public void display() {
      System.out.println("Area is: " +area+" Perimeter is: "+perimeter);
   }

}

class Circle implements Shape{
   private float radius;
   private float area;
   private float perimeter;
   @Override
   public void input() {
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the Radius of the Circl:");
      this.radius = scanner.nextFloat();
     
      scanner.close();
   }

   @Override
   public void calculate() {
     area = (float) (3.14 * radius * radius);
     perimeter = (float) (2 * 3.14 * radius);

   }

   @Override
   public void display() {
      System.out.println("The Area of the circle with radius: "+radius+" is: "+area+" and the perimeter is: "+perimeter);
   }

}
class Geomentry{
   public  void performOperations(Shape shape){
      shape.input();
      shape.calculate();
      shape.display();
   }
}


public class Question1{ 
    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);
         
          
           Geomentry g =  new Geomentry();
           System.out.println("Select the shape :\n1.Rectangle\n2.Circle\n3.Square");
           int option =  scanner.nextInt();
           switch(option){
            case 1:
              Shape s1=  new Rectangle();
                g.performOperations(s1);
                break;
                  case 2:
                  Shape s2 = new Circle();
                  g.performOperations(s2);
                  break;
                   case 3:
                  Shape s3 = new Square();
                  g.performOperations(s3);
                  break;
                  default:
                  System.out.println("No shape available");
                  break;
           } 
     
             
        scanner.close();
    }



}