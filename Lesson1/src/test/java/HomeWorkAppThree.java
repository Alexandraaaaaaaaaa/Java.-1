public class HomeWorkAppThree {
    public HomeWorkAppThree() {
    }

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        invertArray();
        createArrParams(5,99);
    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        int count = arr.length;
        for (int i = 0; i < count; i++) {
            if (arr[i] == 0) {
                System.out.println(1);
            }
            if (arr[i] == 1) {
                System.out.println(0);
            }
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                System.out.println(arr[i] * 2);
        }

    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i][i] = 1);
        }
    }
    public static int[] createArrParams(int len, int initialValue) {
        int[]arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;

        }

        return arr;
    }
}
