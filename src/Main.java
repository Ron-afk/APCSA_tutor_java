import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student("tim","tom");
//        Student s2 = s1;
//        s1.setGrade(10);
//        System.out.println(s2.getGrade());
//
//        int a =10;
//        int b = a;
//        a=20;
//        System.out.println(b);
        String[] wordArray = {"wheels", "on", "the", "bus"};
        RandomStringChooser sChooer = new RandomStringChooser(wordArray);
        for(int i = 0; i< 6; i++){
            System.out.println(sChooer.getNext());
        }
    }


//    public static int add(int a, int b) {
//        int c = a + b;
//        return c;
//    }
//
//    public static int fab(int n) {
//        if (n == 1 || n == 2) {
//            return 1;
//        }
//        int a1 = 1; // n-1
//        int a2 = 1; // n-2
//        int a = 1; // n
//        for (int i = 2; i < n; i++) {
//            a = a1 + a2;
//            a2 = a1;
//            a1 = a;
//        }
//        return a;
//    }
//
//    public static void print99() {
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.println(i + " * " + j + " = " + i * j);
//            }
//        }
//    }
}