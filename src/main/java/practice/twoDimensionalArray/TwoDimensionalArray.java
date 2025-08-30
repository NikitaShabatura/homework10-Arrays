package practice.twoDimensionalArray;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        char[][] result = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int y = 0; y < size; y++) {
                if (i == y || y == size - i - 1) {
                    result[i][y] = SYMBOL;
                } else {
                    result[i][y] = ' ';
                }
            }
        }

        return result;
    }
}
