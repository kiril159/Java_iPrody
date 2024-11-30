import java.util.Arrays;

public class HomeWorkApp4 {

    public static void main(String[] args) {
        //System.out.println("Задание №1:");
        //replacementArray(new int[] {1,0,1,0,0});


        //System.out.println("Задание №2:");
        //countArray();

        //System.out.println("Задание №3:");
        //int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        //System.out.println(Arrays.toString(multiplicationArray(arr)));

        //System.out.println("Задание №4.1:");
        //mainDiagonalArray(new int[10][10]);
        System.out.println("Задание 4.2:");
        maiAdditionDiagonalArray(new int[10][10]);

        //System.out.println("Задание №5:");
        //System.out.println(Arrays.toString(createArray(10,7)));

        //System.out.println("Задание №6:");
        //int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, -100 };
        //minMaxValue(arr);

        //System.out.println("Задание №7:");
        //int[] arr = {1, 1, 1, 2, 1, 2 };
        //System.out.println(isBalance(arr));




    }

    public static void replacementArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //arr[i] = arr[i] == 0 ? 1 : 0;
            if (arr[i]==0){
                arr[i]=1;
            } else { arr[i]=0;}
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void countArray(){
        int [] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        System.out.println(Arrays.toString(array));
    }
    public static int[] multiplicationArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //arr[i] = arr[i] > 6 ? arr[i]*2 : arr[i];
            if (arr[i] < 6){
                arr[i] *= 2;
            }
        }
        return arr;
    }
    public static void mainDiagonalArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void maiAdditionDiagonalArray(int[][] arr){
        int lengthX = arr.length;
        for (int i = 0; i < lengthX; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || j == arr[i].length -i -1) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static int[] createArray(int len, int initialValue){
        int[] arr = new int[len];
        //Arrays.fill(arr,initialValue);
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;

    }

    public static void minMaxValue(int[] arr){
        int minValue = arr[0];
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < minValue){
                minValue = arr[i];
            }
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        System.out.println("Минимальное значение: " + minValue);
        System.out.println("Максимальное значение: " + maxValue);

    }

    public static boolean isBalance(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        if (sum % 2 == 0){
            int currentSum = 0;
            for (int i = 0; i < arr.length; i++){
                currentSum += arr[i];
                if (currentSum == sum / 2){
                    return true;
                }

            }
        }

        return false;
    }




}
