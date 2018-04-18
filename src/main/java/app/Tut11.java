package app;

public class Tut11 {
    public static void main(String[] args) {
//التالي فقط تعريف للمصفوفة
        int[] fahadint;
        long[] fahadlong;
        double[] fahaddouble;
        float[] fahadfloat;
        String[] fahadstring;
// الطريقة الأولى لإنشاء المصفوفة تحت بعض, لابد من أن يسبقه تعريف
        fahadint = new int[5];
        fahadint[0] = 25;
        fahadint[1] = 30;
        fahadint[2] = 3;
        fahadint[3] = 40;
        fahadint[4] = 100;

// الطريقة الأولى لإنشاء المصفوفة في سطر واحد , لابد من أن يسبقه تعريف
// بالنسبة للي في سطر واحد مانعطيها الحجم زي الي فوق وهو 5 , لأن الحجم محدد مما بين الأقواس
        // أقصد كعدد
        fahadint = new int[]{10, 8, 16, 25, 36};
       //طباعة الحجم , أقصد عدد القيم الموجودة
       // fahadint.length الأولى الاسم الي حطيته وبعد الدوت طلب الحجم

        //طباعة الحجم
       // System.out.println(fahadint.length);


        for (int i = 0; i < fahadint.length; i++) {
            //طباعة الفهرس
            System.out.println(i);
//طباعة المكونات داخل المصفوفة (fahadint)
            System.out.println(fahadint[i]);
        }

    }
}
