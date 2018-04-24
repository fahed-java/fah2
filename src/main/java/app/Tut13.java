package app;

public class Tut13 {

    public static void main(String[] args) {
        String s = "11122548789525565655";
        int a;
        try {
            System.out.println("عرض الحرف الموجود في الفهرس رقم28:" + s.charAt(28));
            a = Integer.parseInt(s);
        } catch (StringIndexOutOfBoundsException x1) {
            System.out.println("الفهرس المطلوب غير موجود في النص");
            //دالة قيت مسج
            //هنا كلاس الي هو (قيت مسج ) يعطيك الخطأ الحاصل
            System.out.println(x1.getMessage());
            //دالة تو سترنق
            // تعطيني هنا اسم الكلاس الي فيه الخطأ بالإضافة إلى الرسالة الي فيها الخطأ
            System.out.println(x1.toString());
            //دالةبرنت ستاك تراس
            //يعطيني كامل الخطأ باللون الأحمر وكافة المعلومات عن الخطأ
            x1.printStackTrace();
        } catch (NumberFormatException x2) {
            ;
            System.out.println("النص لايمكن تحويله إلى رقم لأنه ليس من نفس النوع");
        } catch (Exception x3) {
            System.out.println("الأخطاء التي لم تعالج هي:" + x3);

        }
        //لايمكن وضع كود بين التراي والكاتش والفاينلي
        // System.out.println("البرنامج مازال يعمل بشكل صحيح");

        finally {
            System.out.println("الكوووووووووووووووود");
        }
    }

}


