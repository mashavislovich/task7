import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**класс, в котором распознается строка, не содержащая цифр
 * Created by Мария on 09.10.2016.
 */
public class Nonumber {
    Scaner sc = new Scaner();

    public static final Pattern pattern = Pattern.compile("^\\D*$");

    public static void doMatch(String s) { // метод, проверяющий наличие цифр в строке
        Matcher matcher = pattern.matcher(s);
        System.out.println("Validation for nonumbers " + s +
                (matcher.matches() ? " passed." : "not passed."));
    }
}
