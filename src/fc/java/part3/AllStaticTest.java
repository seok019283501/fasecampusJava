package fc.java.part3;

import fc.java.model.AllStatic;
public class AllStaticTest {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        int sum = AllStatic.hap(a,b);
        int max = AllStatic.max(a,b);
        int min = AllStatic.min(a,b);
        System.out.println(sum + "  "+ max+" "+min);

    }
}
