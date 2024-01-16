package fc.java.part3;

import fc.java.model.MyUtil1;

public class NonStaticAccess {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;
        MyUtil1 my1 = new MyUtil1();
        int sum = my1.hap(a,b);
        System.out.println(sum);
    }
}
