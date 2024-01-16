package fc.java.part3;

import fc.java.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        //Q. 정수 6개를 저장할 배열을 생성하세요.
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 32;
        arr[2] = 30;
        arr[3] = 67;
        arr[4] = 98;
        arr[5] = 55;
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        Student vo = new Student("홀길동", "컴공", 37,"ㅠㅑㅅ@ㅜ믇",2023110,"010-1111-1111");
        System.out.println(vo);
        Student[] std = new Student[4];
        std[0] = new Student("a","컴공",20,"bb@bbb.com",20000000,"010-1111-1111");
        std[1] = new Student("b","컴공",20,"bb@bbb.com",20000000,"010-1111-1111");
        std[2] = new Student("c","컴공",20,"bb@bbb.com",20000000,"010-1111-1111");
        std[3] = new Student("d","컴공",20,"bb@bbb.com",20000000,"010-1111-1111");
//        for(int i = 0; i < std.length; i++){
//            System.out.println(std[i]);
//        }
        for( Student st : std){
            System.out.println(st);
        }
    }
}
