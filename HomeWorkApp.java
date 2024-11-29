public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Задание №1:");
        printThreeWords();
        System.out.println("Задание №2:");
        checkSumSign();
        System.out.println("Задание №3:");
        printColour();
        System.out.println("Задание №4:");
        compareNumbers();
        System.out.println("Задание №5:");
        System.out.println(checkSumInterval(10,2));
        System.out.println("Задание №6:");
        checkType(10);
        System.out.println("Задание №7:");
        System.out.println(checkTypeBool(-23));
        System.out.println("Задание №8:");
        printStrings("Строка", 2);
        System.out.println("Задание №9:");
        System.out.println(checkTypeYear(2100));



    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 8, b = 7;
        if (a + b >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColour(){
        int value = -100;
        if(value <= 0){
            System.out.println("Красный");
        } else if (value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 10, b = -100;
        if (a >= b){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
    public static boolean checkSumInterval(int a, int b){
        return a+b>=10 && a+b<=20;
    }
    public static void checkType(int a){
        if (a < 0){
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Положительное число");
        }
    }
    public static boolean checkTypeBool(int a){
        return a < 0;
    }
    public static void printStrings(String a, int b){
        for(int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
    public static boolean checkTypeYear(int a){
        return ((a % 4 == 0)&&(a % 100 != 0)||(a % 400 == 0));
    }

}

