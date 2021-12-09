package lesson3;

import java.util.ArrayList;
import java.util.Objects;

public class Box
{
    ArrayList<Fruit> fruits = new ArrayList<Fruit>();

    public void mixFruit(int i1, int i2){
        Fruit fruit1 = fruits.get(i1);
        Fruit fruit2 = fruits.get(i2);

        fruits.remove(i1);
        fruits.remove(i2);

        fruits.add(i1, fruit2);
        fruits.add(i2, fruit1);
    }

    public void addFruit(Fruit fruit)
    {
        if (fruits.isEmpty()){
            fruits.add(fruit);
            return;
        }

        Fruit inBox = fruits.get(0);

        if (Objects.equals(inBox.getType(), fruit.getType())) {
            fruits.add(fruit);
        }
    }


    public int getWeight()
    {
        if (fruits.isEmpty()) {
            return 0;
        }

        Fruit fruit = fruits.get(0);

        return fruit.getWeight() * fruits.size();
    }

    public boolean compare(Box box)
    {
        return this.getWeight() == box.getWeight();
    }

    public String getTypeInBox(){
        return fruits.get(0).getType();
    }

    public void pourOver(Box box)
    {
        if (fruits.isEmpty()) {
            return;
        }

        if (box.getWeight() != 0 && this.getTypeInBox() != box.getTypeInBox()) {
            return;
        }

        Fruit[] array = new Fruit[fruits.size()];
        fruits.toArray(array);

        for (int i = 0; array.length > i; i++){
            box.addFruit(array[i]);
        }

        fruits.clear();
    }
}

