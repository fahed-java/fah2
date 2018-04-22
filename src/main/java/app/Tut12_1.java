package app;

public class Tut12_1 {
    public static void main(String[] args){
//هنا يظهر لي أن القيم الموجودة 5 وطلب مني الفهرس10 وهو غير موجود
        // يظهر لي رسالة أن المطلوب خاطئ ويستمر بتنفيذ الأكواد

        try {
            int[]a=new int [5];
            System.out.println(a[10]);
        }
        catch (Exception e){
            System.out.println("الخطأ هو : " + e);
        }
        System.out.println("هناك خطأ والبرنامج مازال يعمل بشكل طبيعي");
    }
}
