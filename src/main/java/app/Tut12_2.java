package app;

public class Tut12_2 {
    public static void main(String[] args) {
        String s = "11122548789525565655";
        int a;
        try {
            System.out.println("عرض الحرف الموجود في الفهرس رقم28:" + s.charAt(28));
            a = Integer.parseInt(s);
        } catch (StringIndexOutOfBoundsException x1) {
            System.out.println("الفهرس المطلوب غير موجود في النص");
        } catch (NumberFormatException x2) {
            System.out.println("النص لايمكن تحويله إلى رقم لأنه ليس من نفس النوع");
        } catch (Exception x3) {
            System.out.println("الأخطاء التي لم تعالج هي:" + x3);

        }
        System.out.println("البرنامج مازال يعمل بشكل صحيح");
    }

}
