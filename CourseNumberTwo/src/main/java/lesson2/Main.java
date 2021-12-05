package lesson2;

public class Main {
    public static void main(String[] args){
        String[][] array = new String[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = "2";
            }
        }

        try {
            TakeArray.ar(array);
        } catch (ArrayIndexOutOfBoundsException MyArraySizeException) {
            MyArraySizeException.printStackTrace();
            System.out.println("Исключение MyArraySizeException проброшено");
        } catch (NumberFormatException MyArrayDataException) {
            MyArrayDataException.printStackTrace();
            System.out.println("Исключение sdfsdfsdf sdfsdfsdf");
        }
    }
}