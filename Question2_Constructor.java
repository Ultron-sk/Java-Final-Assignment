class CricketPlayer{
   CricketPlayer(){
    System.out.println("I am a Cricket Player");
   }
}
class King extends CricketPlayer{
    King(){
        System.out.println("I am Virat Kohli");
    }
}

@SuppressWarnings("unused")
public  class Question2_Constructor{
    public static void main(String[] args) {
        CricketPlayer cricketPlayer = new King();
    }
}
/*
 * Constructor Key Points:
 * 
 * Constructor is a memeber method which gets invoked when the object is created
 * Name of the constructor is same as the class and return nothing (no return type)
 * If no constructor is defined JVM will create a default constructor
 * The first line of every constructor is the super() method , even though the class not extending anything as Object class is parent of all class
 * Whenever we create the object of subclass it calls the super class constructor because of super()
 * 
 */