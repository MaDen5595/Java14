import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task5 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d{1,2}/\\d{1,2}/\\d{4}");
        Scanner sc = new Scanner(System.in);
        String e = sc.nextLine();
        Matcher m = p.matcher(e);
        boolean b = m.matches();
        if(b){
            StringTokenizer st = new StringTokenizer(e,"/");
            int day = Integer.parseInt(st.nextToken());
            int mes = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            if(year<1900){
                System.out.println("Не соответствует");
            }
            else{
                if(day == 0){
                    System.out.println("Не соответствует");
                }
                if(mes == 1 | mes == 3 | mes == 5 | mes == 7 | mes == 8 | mes == 10 | mes == 12){
                    if(day > 31){
                        System.out.println("Не соответствует");
                    }
                    else{
                        System.out.println("Соответствует");
                    }
                }
                else if (mes == 4 | mes == 6 | mes == 9 | mes == 11) {
                    if(day > 30){
                        System.out.println("Не соответствует");
                    }
                    else{
                        System.out.println("Соответствует");
                    }
                }
                else if (mes == 2) {
                    if((year%4==0 & year%100 != 0) | (year%400 == 0)){
                        if(day > 29){
                            System.out.println("Не соответствует");
                        }
                        else{
                            System.out.println("Cоответствует");
                        }
                    }
                    else{
                        if(day > 28){
                            System.out.println("Не соответствует");
                        }
                        else{
                            System.out.println("Cоответствует");
                        }
                    }
                }
                else{
                    System.out.println("Не соответствует");
                }
            }

        }
        else{
            System.out.println("Не соответствует");
        }
    }
}
