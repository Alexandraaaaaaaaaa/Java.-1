package lesson3;

public class Main {
    public static void main(String[] args){
        Apple apple = new Apple();
        Apple apple1 = new Apple();

        Box box = new Box();
        Box box1 = new Box();

        box.addFruit(apple);
        box1.addFruit(apple1);

        box.pourOver(box1);
        System.out.println(box.getWeight());
        System.out.println(box1.getWeight());
    }
}
