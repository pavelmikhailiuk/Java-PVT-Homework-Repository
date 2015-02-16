package homework.lab18_1;


/**
 * Created by Natashka on 15.02.2015.
 */
public class LastLetterWordtest {
    public static void main(String[] args) {
        String str = "зря буду обруч кучу угля слов завтра";
        LastLetterWord llw = new LastLetterWord();
        llw.setStr(str);
        llw.lastLetter();
    }
}
