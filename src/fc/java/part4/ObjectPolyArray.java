package fc.java.part4;

import fc.java.poly.*;

public class ObjectPolyArray {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Object[] obj = new Object[2];
        obj[0] = a;
        obj[1] = b;
        display(obj);

    }

    private static void display(Object[] obj) {
        for(int i = 0; i < obj.length; i++){
            if(obj[i] instanceof A){
                ((A)obj[i]).printGo();
            }else{
                ((B)obj[i]).printGo();
            }
        }

    }

}
