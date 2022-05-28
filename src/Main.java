import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
task5();
task6();
task7();
    }
    public static void task5() {
        //Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте ее в консоль. Постарайтесь заполнить обе диагонали в одном цикле.
        //Для печати следует использовать следующий код:
        //for (int[] row : matrix) {
        //	for (int column : row) {
        //		System.out.print(column + " ");
        //	}
        //	System.out.println();
        //}
        //Критерии оценки:
        //– В консоль выводится матрица 3х3 со значениями единицы по диагонали.
        //– При изменении единицы на другое значение матрица выводится в консоль корректно.
        //– Для вывода результата в консоль используется один цикл.
        int[][]matrixA;
        matrixA = new  int[3][3];
        matrixA[0][0] = 1;
        matrixA[0][1]= 1;
        matrixA[0][2] = 1;
        matrixA[1][0] = 1;
        matrixA[1][1] = 1;
        matrixA[1][2] = 1;
        matrixA[2][0] = 1;
        matrixA[2][1] = 1;
        matrixA[2][2] = 1;
        for (int i = 0; i < matrixA.length;i++) {

        }
        for (int[] row : matrixA) {
        	for (int column : row) {
        		System.out.print(column + " ");
        	}
        	System.out.println();
        }
    }
    public static void task6() {
        int[] arr =  {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        for ( int i = 0, j = arr.length - 1; i < j; ++i, --j ) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        for ( int i : arr )
            System.out.print(i + " ");
        System.out.println();
        System.out.println(Arrays.toString(arr));
        }
        public static void task7() {
        // Решите предыдущее задание, но без использования дополнительного массива.
            //Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
            //Выведите результат программы в консоль тем же способом.
            //Уточнения:
            //Это задание не на сортировку.
            //Не использовать Arrays.sort() и другие способы сортировок.
            //Числа в порядке убывания даны исключительно для указания направления чтения.
            //Массив может быть 5 8 2 3 9, нужно из него сделать 9 3 2 8 5.
            int[] arr =  {5, 8, 2, 3, 9};
            System.out.println(Arrays.toString(arr));
            for (int i = arr.length - 1; i >=0 ; i --) {
                System.out.print(arr[i] + " ");

            }
            System.out.println(Arrays.toString(arr));
        }
    }

