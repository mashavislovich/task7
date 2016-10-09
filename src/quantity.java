import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**класс в котором мы определяем, не больше ли 5 слов содержит строка
 * Created by Мария on 09.10.2016.
 */
public class quantity {
    Scaner sc = new Scaner();
    public static final Pattern pattern = Pattern.compile("^[a-zA-z]*$"); // задаем чтобы в строке были только буквенные выражения

    public static void doMatch(String s2) { // метод для компилирования регулярных выражений и сравнения их со строкой
        Matcher matcher = pattern.matcher(s2);
        String[] strings = s2.split(",\\s?");

        if (strings.length > 4 && checkIsOnlyLetters(strings)) { // определяем больше ли 5 слов в строке
            System.out.println(" Validation for quantity" + s2 + "passed");
        } else {
            System.out.println(" Validation for quantity" + s2 + " not passed");
        }
    }
    public static boolean checkIsOnlyLetters(String[] strings){ // метод для в котором программа убеждается что строка состоит из буквенных символов
        boolean isOnlyLetters = true;
        for (String string : strings){
            Matcher matcher = pattern.matcher(string);
            isOnlyLetters = isOnlyLetters && matcher.matches();

        }
        return isOnlyLetters;
    }
}


