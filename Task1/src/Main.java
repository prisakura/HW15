public class Main {

    public static void main(String[] args) {
        for (char a = 'а'; a<= 'я';a++) {
            System.out.println(Character.toUpperCase(a)+" - "+(int)Character.toUpperCase(a));
            System.out.println(a+" - "+(int)a);
        }
    }
}