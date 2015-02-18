package homework.lab21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Natashka on 17.02.2015.
 */
public class TagReplace {
    private String str;

    public TagReplace(String str) {
        this.str = str;
    }

    public String tagReplace() {
        return str.replaceAll("<p [^>]+>", "<p>");
    }
}
