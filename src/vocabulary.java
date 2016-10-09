import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Мария on 09.10.2016.
 */
public class vocabulary {
    Scaner sc = new Scaner();
    public static final Pattern pattern = Pattern.compile("^[a-zA-z]*$"); // задаем  диапазон символов - буквенные

    public static void doMatch(String s3) {  // компилируются регулярные выражения и сравниваютс со строкой методом matcher
        Matcher matcher = pattern.matcher(s3);
        String[] strings = s3.split(",?\\s+"); // делим строку на массив из слов


        boolean isContains = false; // сначала присваиваем false
        String[] vocabulary = {"bacon", "cat", "dog"};// словарь
        for (String string : strings) { // перебираем массив и ищем соответствия
            if (Arrays.asList(vocabulary).contains(string)) {
                System.out.println("слово " + string + " из строки есть в словаре");

            }
            isContains = true;// если соответствия найдены, тогда true
            if (!isContains) {
                System.out.println(" ни одного слова из словаря нет в строке");
            }
        }
    }
}



