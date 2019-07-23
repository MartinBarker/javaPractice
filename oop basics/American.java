//class American is a child class (sub class) of Human
//human is base class

//extends interface flyable
public class American extends Human implements Flyable{
    //static = can be accessed without requiring an instantiation of the class to which it belongs.
    static int objectCount = 0;

    public American(String name, int age, int heightInInches, String eyeColor){
        super(name, age, heightInInches, eyeColor);
        objectCount++;
    }

    public void freeSpeech(){
        System.out.println("Engaging in free speech...");
    }

    public void speak(){
        System.out.println("Yee-Haw, my name is " + name + ". ");
        System.out.println("I am " + heightInInches + " tall.");
        System.out.println("I am " + age + " years old.");
        System.out.println("My eye color is " + eyeColor + ". ");
    }

    public void numAmericans(){
        System.out.println("There are " + objectCount + " Americans. ");
    }

    public void fly(){
        //interface = contract
        //any class that interfaces it, interfaces wants it to promise it will implemenet that method
        //class can only extend one parent
        System.out.println("This American grew wings and flew. ");
    }
}