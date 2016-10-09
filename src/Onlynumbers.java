import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** класс в котором распознаем строку, содержащую только цифры
 * Created by Мария on 09.10.2016.
 */
public class Onlynumbers {
    Scaner sc = new Scaner();
    public static final Pattern pattern = Pattern.compile("^\\d*$");

    public static void doMatch(String s1) { // метод, который проверяет наличие цифр в строке
        Matcher matcher = pattern.matcher(s1);
        System.out.println("Validation for onlynumbers " + s1 +
                (matcher.matches() ? " passed." : "not passed."));
    }
}


