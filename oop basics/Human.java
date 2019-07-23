
/* 
This is a simple Java program. 
FileName : "Human.java". 
Compile with "javac Human.java"
Run with "java Human"
*/
public class Human{

    String name;
    int age;
    int heightInInches;
    String eyeColor;

    //constructor, defines how to create class object
    //comes by default, we dont need to explicitly define it 
    public Human(String name, int age, int heightInInches, String eyeColor){
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    public void speak(){
        System.out.println("Hello, my name is " + name + ". ");
        System.out.println("I am " + heightInInches + " tall.");
        System.out.println("I am " + age + " years old.");
        System.out.println("My eye color is " + eyeColor + ". ");
    }

    public void eat(){
        System.out.println("Eating...");
    }

    public void walk(){
        System.out.println("Walking...");
    }

    public void work(){
        System.out.println("Working...");
    }
    // Your program begins with a call to main(). 
    public static void main(String args[]) 
    { 
        System.out.println("Hello, World"); 
    } 
} 