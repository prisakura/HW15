import java.util.Scanner;

public class Main {
    public static final String VAL_VAL = "АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдежзийклмнопрстуфхцчшщъыьэюя-";

    private static String f,i,o;

    private static boolean valString(String s){
        int spaceCount = 0;
        for (int i=0; i<s.length();i++)
            if (!VAL_VAL.contains(String.valueOf(s.charAt(i))))
                if(s.charAt(i)==' ')
                   if(spaceCount+1>2||s.charAt(i+1)==' ') return false; else spaceCount++;
                 else
                     return false;
        return spaceCount==2;
    }

    private static void getFIO(String s){
    f=s.substring(0,s.indexOf(' ')).trim();
    i=s.substring(s.indexOf(' '),s.lastIndexOf(' ')).trim();
    o=s.substring(s.lastIndexOf(' ')).trim();
    }

    public static void main(String[] args) {
        System.out.print("Введите Ф.И.О: ");
        String input = new Scanner(System.in).nextLine();
        input=input.trim();
        if (!valString(input.trim())) {
            System.out.println("Неккорректный ввод!");
        } else {
            System.out.println("Ваши Ф.И.О:");
            getFIO(input);
            System.out.println(f);
            System.out.println(i);
            System.out.println(o);
        }

    }


}