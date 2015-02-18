package homework;

/**
 * Created by Natashka on 16.02.2015.
 */
public enum Day {
    MONDAY("Понедельник"),TUESDAY("ВТОРНИК");
    private String russianVariant;

    Day(String russianVariant) {
        this.russianVariant = russianVariant;

    }

    public String getRussianVariant() {
        return russianVariant;
    }
}
