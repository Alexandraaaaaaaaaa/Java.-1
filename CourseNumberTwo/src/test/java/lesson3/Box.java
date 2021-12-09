package lesson3;

import java.util.ArrayList;
import java.util.Objects;

public class Box
{
    ArrayList<Fruit> fruits = new ArrayList<Fruit>();

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
}
