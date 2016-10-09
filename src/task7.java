

/**класс для выполнения обработки строк, введенных пользователем
 * Created by Мария on 09.10.2016.
 */

public class task7 {
public static void main(String[] args){
    Scaner sc = new Scaner();
    sc.Scaner();
    Nonumber n = new Nonumber(); //вызов класса проверяющего на наличие цифр в строке
    String string = sc.getS(); // вызов переменной из класса Scaner, соответствующей введенной строке
    n.doMatch(string);
    Onlynumbers on = new Onlynumbers();
    String string1 = sc.getS1();
    on.doMatch(string1);
    quantity q = new quantity();
    String string2 = sc.getS2();
   q.doMatch(string2);
    vocabulary v = new vocabulary();
    String string3 = sc.getS3();
    v.doMatch(string3);



}
}
