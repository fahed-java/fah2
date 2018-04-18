package app;

public class Tut11_1 {
    public static void main(String[] args) {

        int[] fahadint;
        fahadint = new int[]{10, 8, 16, 25, 36};
       int i = 0;
        while (i<fahadint.length) {
            //طباعة الفهرس
            System.out.println(i);
//طباعة المكونات داخل المصفوفة (fahadint)
            System.out.println(fahadint[i]);
            i++;

        }
    }
}
