package app;

public class Tut11_2 {
    public static void main(String[] args) {
        int[] fahadint;
        fahadint = new int[10];
        int i = 0;
        while (i<5) {
            fahadint[i]=8;
            i++;

        }
        for (int k = 0; k < 5; k++) {
            //طباعة الفهرس
         //   System.out.println(k);
//طباعة المكونات داخل المصفوفة (fahadint)
            System.out.println(fahadint[k]);
        }
    }
}
