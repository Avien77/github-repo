package src;



public class Animal {
int age;
String gender;
public static void main(String [] args){
Animal myAnimal = new Animal();
Animal myFish = new Fish();
Animal myZebra = new Zebra();
        myAnimal.isMammal();
        myAnimal.mate();
        ((Fish) myFish).canEat(); 
        ((Zebra) myZebra).run();
}
    public void isMammal(){
        System.out.println("This is a private method isMammal() from class Animal");
    }
    public void mate(){
        System.out.println("This is a private method mate() from class Animal");
    }
}
class Fish extends Animal{
private int sizeInFeet;

public void canEat(){
    System.out.println("This is a private method canEat() from class Fish");
}
}
class Zebra extends Animal{
public boolean is_wild;

public void run(){
    System.out.println("This is a private method run() from class Zebra");
}
}
