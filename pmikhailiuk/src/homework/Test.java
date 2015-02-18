package homework;

import java.util.Arrays;

/**
 * Created by Natashka on 16.02.2015.
 */
public class Test {
    public static void main(String[] args) {
        String str = "Test   string for split";
        System.out.println(Arrays.toString(str.split("t+")));

        Day day = Day.TUESDAY;
        System.out.println(day.getRussianVariant());
    }
}
