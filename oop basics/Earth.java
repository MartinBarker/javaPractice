public class Earth{
    public static void main(String args[]){
        Human tom;
        tom = new Human("Tom Bobo", 5, 72, "brown");
        tom.age = 7;
        tom.speak();

        American George = new American("George Washington", 5, 72, "blue");
        George.freeSpeech();
        George.speak();
        George.numAmericans();
        George.fly();

    }
}