package fc.java.part3;

import fc.java.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student st1; // st1 : Object
        Student st2;// st2 : Object
        Student st3;// st3 : Object
        st1 = new Student("홍길동","ㅁ",23,"ㅁ",23,"010-1111-1111");
        st2 = new Student("홍길동","ㅁ",23,"ㅁ",23,"010-1111-1111");
        st3 = new Student("홍길동","ㅁ",23,"ㅁ",23,"010-1111-1111");
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
