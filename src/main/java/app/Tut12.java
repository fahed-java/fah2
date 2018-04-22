package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tut12 {

    public static void main(String[] args) {
// وضعت الدالة هذي في المين لأن المين هو أساس العمل
        asd1();

    }

    public static void asd1() {
        int a1;
        Scanner a2 = new Scanner(System.in);

        System.out.println("ادخل رقم ");

        try {
            a1 = a2.nextInt();

        } catch (InputMismatchException a3) {
            System.out.println("فضلا أدخل القيمة الصحيحة");
            // في الأسفل استدعاء للدالة نفسها للتكرار
            asd1();

        }
    }

}
