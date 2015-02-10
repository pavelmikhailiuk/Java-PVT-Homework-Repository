package homework.test4;

/**
 * Created by Natashka on 05.02.2015.
 */
public class Test4 {
    public static void main(String[] args) {
        float a = 6.7f;
        float b = 8.5f;
        float r = 5.2f;
        if ((a * a + b * b) <= 4 * r * r) {
            System.out.println("Прямоугольное отверстие размерами " + a + " на " + b + " можно закрыть кругом с радиусом " + r);
        } else {
            System.out.println("Прямоугольное отверстие размерами " + a + " на " + b + " нельзя закрыть кругом с радиусом " + r);
        }
    }
}
