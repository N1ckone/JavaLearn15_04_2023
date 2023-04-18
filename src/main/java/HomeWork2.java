import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
        int[] array = {1,1,0,0,1,0,1,1,0,0};

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0)
                array[i] = 1;
            else if(array[i] == 1)
                array[i] = 0;
        }

        System.out.println(Arrays.toString(array)); //[0, 0, 1, 1, 0, 1, 0, 0, 1, 1]


        //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

        int[] array2 = new int[8];
        int count = 0;
        for (int i = 0; i < array2.length; i++) {
            array2[i] = count;
            count += 3;
        }

        System.out.println(Arrays.toString(array2)); //[0, 3, 6, 9, 12, 15, 18, 21]


        //3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array3.length; i++) {
            if(array3[i] < 6)
                array3[i] *= 2;
        }

        System.out.println(Arrays.toString(array3)); //[2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2]


        /*4. 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами; */

        int[][] matrix = new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(i == j ) {
                    matrix[i][j] = 1;
                }

                matrix[i][matrix.length - i - 1] = 1;

            }
        }


      //цикл для проверки вывода
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

        //решение 1
        int[] array4 = {4, -1, 34, 6, 9, -26, 24, 1};
        Arrays.sort(array4);
        int max = array4[array4.length - 1];
        int min = array4[0];

        System.out.println(max); //34
        System.out.println(min); //-26

        //решение 2
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < array4.length; i++) {
            if(array4[i] > maximum)
                maximum = array4[i];

            if(array4[i] < minimum)
                minimum = array4[i];
        }

        System.out.println(maximum); //34
        System.out.println(minimum); //-26


        //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
        // граница показана символами ||, эти символы в массив не входят.

        int[] arr = {1,2,2,3,5,6,7};
        int[] arr2 = {2,4,5,7};
        System.out.println(isBalancedArray(arr)); //true
        System.out.println(isBalancedArray(arr2)); //false


        /* **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
        Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) ->
        [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами. */

        int[] arr3 = {1,2,3};
        move(arr3, 1);



    }

    public static boolean isBalancedArray(int[] arr) {

        int leftPart = 0;
        int rightPart = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            leftPart+= arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                rightPart+= arr[j];
            }
            if(leftPart == rightPart) {
                return true;
            }
            rightPart = 0;
        }
        return false;
    }

    public static void move(int[] arr, int index) {
        if(index > 0)
            moveOnRight(arr, index);
        else if(index < 0)
            moveOnLeft(arr, index);
    }

    private static void moveOnRight(int[] arr, int index) {
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < arr.length; j++) {


            }
        }
    }

    private static void moveOnLeft(int[] arr, int index) {

    }
}
