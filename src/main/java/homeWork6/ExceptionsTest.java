package homeWork6;

public class ExceptionsTest {

    public static void main(String[] args) {
        String[][] strings = new String[4][4];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                strings[i][j] = "1";
            }
        }
        //strings[2][3] = "Привет"; //с этой строкой будет исключение
        int sum = 0;
        try {
            sum = checkSizeArrayParseAndSum(strings);
        } catch (MyArraySizeException e) {
            System.out.println(e.fillInStackTrace());
        } catch (MyArrayDataException e) {
            System.out.println(e.fillInStackTrace());
        }
        System.out.println(sum);
    }

    public static int checkSizeArrayParseAndSum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length == 4) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4) {
                    throw new MyArraySizeException("Метод принимает только двумерный массив размера [4][4]");
                }
                for (int j = 0; j < arr.length; j++) {
                    try {
                        int num = Integer.parseInt(arr[i][j]);
                        sum += num;
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(
                                String.format("Неверные данные. Ошибка произошла в ячейке [%d][%d]", i, j));
                    }
                }
            }
            return sum;
        } else {
            throw new MyArraySizeException("Метод принимает только двумерный массив размера [4][4]");
        }
    }
}
