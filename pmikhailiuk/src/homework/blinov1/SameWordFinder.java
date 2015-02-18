package homework.blinov1;

import homework.lab16.SameWord;

/**
 * Created by Natashka on 18.02.2015.
 */
public class SameWordFinder {
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public void sameWord() {
        String[] sentence = str.split("[.,\\x3f!]");
        int[] swInSent = new int[sentence.length];
        int maxVal = 0;
        int maxIndex = 0;
        for (int i = 0; i < sentence.length; i++) {
            String arr = sentence[i];
            String[] words = arr.split("\\s");
            SameWord sameWord = new SameWord(words);
            swInSent[i] = sameWord.findSameWordNumber();
            for (int j = 0; j < swInSent.length; j++) {
                if (maxVal < swInSent[j]) {
                    maxVal = swInSent[j];
                    maxIndex = j;
                }
            }
        }
        System.out.println("Предложение № " + maxIndex + " содержит " + maxVal + " повторяющихся слов");
    }
}
