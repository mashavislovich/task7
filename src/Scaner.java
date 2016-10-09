/**класс для считывания строки из консоли
 * Created by Мария on 09.10.2016.
 */
import java.util.Scanner;
public class Scaner {
    String s = new String(); // создаем строки
    String s1 = new String();
    String s2 = new String();
    String s3 = new String();


    public void Scaner() {

        System.out.println("Input s:");
        Scanner scn = new Scanner(System.in);
        s = scn.nextLine();
        System.out.println("Input s1:");
        s1 = scn.nextLine();
        System.out.println("Input s2:");
        s2 = scn.nextLine();
        System.out.println("Input s3:");
        s3 = scn.nextLine();





    }
    public String getS(){return s;}; // возвращаем значения строк
    public String getS1(){return s1;};
    public String getS2(){return s2;};
    public String getS3(){return s3;};

}


