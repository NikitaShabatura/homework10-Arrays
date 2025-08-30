package practice.reverseArray;

import java.util.Arrays;

public class ReverseArray {

    public static String[] reverse(String[] strings) {
        //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
        String[] reverseStrings = new String[strings.length];
        int index = 0;
        for (int i = strings.length - 1; i >= 0; i--) {
            reverseStrings[index] = strings[i];
            index++;
        }
        for (int i = 0; i < reverseStrings.length; i++) {
            strings[i] = reverseStrings[i];
        }
        return strings;
    }

}