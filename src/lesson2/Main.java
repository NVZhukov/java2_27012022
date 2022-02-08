package lesson2;

public class Main {
    public static void main(String[] args) {

        String[][] arr = {
                {"1", "3", "1", "5"},
                {"11", "3", "14", "2"},
                {"9", "7", "21", "15"},
                {"3", "9", "6", "9"}
        };

        String[][] arr2 = {
                {"1", "3", "1", "5"},
                {"11", "3", "14", "2"},
                {"9", "7", "14", "21", "15"},
                {"3", "9", "6", "9"}
        };

        String[][] arr3 = {
                {"1", "3", "1", "5"},
                {"11", "3", "14", "2"},
                {"9", "7e", "21", "15"},
                {"3", "9", "6", "9"}
        };

        try {
            System.out.println(sumArr(arr3));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println("Строка: " + e.getA() + " " + "Столбец: " + e.getB());
        }


        System.out.println("System check");

    }

    public static int sumArr(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length) {
                throw new MyArraySizeException("Неверный размер массива");
            }
        }
        int sum = 0;
        int[][] arr2 = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    arr2[i][j] = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные", i, j);
                }
            }
        }
        for (int x[] : arr2) {
            for (int y : x) {
                sum += y;
            }
        }
        return sum;
    }
}
