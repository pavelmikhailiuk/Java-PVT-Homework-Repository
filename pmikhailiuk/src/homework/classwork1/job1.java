package homework.classwork1;

/**
 * Created by Natashka on 10.02.2015.
 */
public class job1 {
    public static void main(String[] args) {
        double num = 758956.321456987;
        num = num % 1 * 1000;
        num = num - num % 1;
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + num % 10;
            num = (num - num % 10) / 10;
        }
        System.out.println(sum);
    }
}
