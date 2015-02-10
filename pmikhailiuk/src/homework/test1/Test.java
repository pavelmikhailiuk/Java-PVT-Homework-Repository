package homework.test1;

/**
 * Created by Natashka on 04.02.2015.
 */
public class Test {
    public static void main(String[] args) {
        int x = 34;
        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println(x * x);
        } else if (x % 3 == 0) {
            System.out.println(++x);
        }


        System.out.println("число не делится без остатка ни на 3 ни на 5");
    }
}

