package lesson2;

import java.lang.reflect.Array;

public class TakeArray
{
    public static void ar(String[][] array)
    {
        isTrueArrayLength(array.length);
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            isTrueArrayLength(array[i].length);
            for (int j = 0; j < array[i].length; j++) {
                total += Integer.parseInt(array[i][j]);
            }
        }

        System.out.println(total);
    }

    private static void isTrueArrayLength(int length)
    {
        if(length != 4){
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
