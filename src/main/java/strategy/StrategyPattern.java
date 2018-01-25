package strategy;

/**
 * Created by yjlee on 2018-01-25.
 */
public class StrategyPattern {


    public static void main(String[] args){

        Animal tiger = new Tiger();
        tiger.performCry();
        tiger.performFly();
        tiger.display();

        System.out.println("====================");

        Animal eagle = new Eagle();
        eagle.performFly();
        eagle.performCry();
        eagle.display();

    }
}

abstract class Animal{
    protected Fly fly;
    protected Cry cry;
    public void performFly(){
        fly.fly();

    }

    public void performCry(){
        cry.cry();
    }

    public void move(){
        System.out.println("움직인다.");
    }

    public abstract void display();

}

interface Fly {
    public void fly();
}
interface Cry{
    public void cry();
}

class BirdCry implements Cry{

    public void cry() {
        System.out.println(" bird cry");
    }
}

class CryNoWay implements Cry{

    public void cry() {
        System.out.println(" cry no way");
    }
}

class FlyNoWay implements Fly{
    public void fly() {
        System.out.println("fly no way");
    }
}

class FlyWithWings implements Fly{

    public void fly() {
        System.out.println(" fly with wings");
    }
}

class Eagle extends Animal{

    public Eagle(){
        cry = new CryNoWay();
        fly = new FlyWithWings();
    }

    public void display() {
        System.out.println(" 독수리 ");
    }
}

class Tiger extends Animal{

     public Tiger(){
        cry = new CryNoWay();
        fly = new FlyNoWay();
     }


    public void display() {
        System.out.println(" 호랑이");
    }
}

