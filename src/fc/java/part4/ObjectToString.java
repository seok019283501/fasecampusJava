package fc.java.part4;

import fc.java.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board b = new Board();
        b.setTitle("게시글");
        System.out.println(b.getTitle());
        System.out.println(b.toString());
        System.out.println(b);
    }
}
