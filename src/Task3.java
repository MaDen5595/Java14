import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern p1 = Pattern.compile("(\\d+)(\\.\\d+)* USD");
        Pattern p2 = Pattern.compile("(\\d+)(\\.\\d+)* RUB");
        Pattern p3 = Pattern.compile("(\\d+)(\\.\\d+)* EU");
        String e = sc.nextLine();
        Matcher m1 = p1.matcher(e);
        Matcher m2 = p2.matcher(e);
        Matcher m3 = p3.matcher(e);
        System.out.println("Цены в USD:");
        while(m1.find()){
            System.out.println(m1.group());
        }
        System.out.println("Цены в RUB:");
        while(m2.find()){
            System.out.println(m2.group());
        }
        System.out.println("Цены в EU:");
        while(m3.find()){
            System.out.println(m3.group());
        }
    }
}
