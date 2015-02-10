package homework.classwork4;


/**
 * Created by Natashka on 10.02.2015.
 */
public class job4 {
    public static void main(String[] args) {
        int randNumber = (int) (Math.random() * 1000);
        if (randNumber < 100) {
            randNumber += 100;
        }
        int[] digitArray = new int[3];
        int count = 0;
        int count1 = 0;
        System.out.print("Случайное число: " + randNumber);
        switch (randNumber) {
            case 781:
            case 302:
            case 409:
            case 941: {
                System.out.println(" Магическое");
                break;
            }
            default: {
                for (int i = 0; i < digitArray.length; i++) {
                    digitArray[i] = randNumber % 10;
                    randNumber = (randNumber - randNumber % 10) / 10;
                    if (digitArray[0] == digitArray[i]) {
                        count++;
                    }
                }
                for (int i = 0; i < digitArray.length - 1; i++) {
                    if (digitArray[i] - 1 == digitArray[i + 1]) {
                        count1++;
                    }
                }
                if ((count == digitArray.length) || (count1 == digitArray.length - 1)) {
                    System.out.println(" Счастливое");
                } else {
                    System.out.println(" Несчастливое");
                }
            }
        }
    }
}



