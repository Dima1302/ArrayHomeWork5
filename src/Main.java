import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.print(" Элементы 1 го массива по порядку ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print(" Элементы в обратном порядке ");
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static void task2() {
        double[] array = {1.57, 7.654, 9.986};
        System.out.print(" Элементы 2 го массива по порядку ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print(" Элементы в обратном порядке ");
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static void task3() {
        int[] daysInWeek = new int[7];
        System.out.print(" Элементы 3 го массива по порядку ");
        daysInWeek[0] = 1;
        daysInWeek[1] = 2;
        daysInWeek[2] = 3;
        daysInWeek[3] = 4;
        daysInWeek[4] = 5;
        daysInWeek[5] = 6;
        daysInWeek[6] = 7;
        for (int i = 0; i < daysInWeek.length; i++) {
            if (i == daysInWeek.length - 1) {
                System.out.print(daysInWeek[i] + " ");
            } else {
                System.out.print(daysInWeek[i] + ", ");
            }
        }
        System.out.print(" Элементы в обратном порядке ");
        for (int i = daysInWeek.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(daysInWeek[i] + " ");
            } else {
                System.out.print(daysInWeek[i] + ", ");
            }

        }
    }
    public static void task4() {
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.print(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = array[i] + 1;
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(", ");}
            } else if (array[i] % 2 == 0) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(", ");}
            }
        }
    }
}
