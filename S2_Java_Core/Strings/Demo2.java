package S2_Java_Core.Strings;

public class Demo2 {
    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity()); // Provides 16 bits capacity by default.
        sb1 = new StringBuffer("George");
        System.out.println(sb1.capacity()); // 5 + 16 . extra space to reduce memory relocation due to non-contiguous memory.
        System.out.println(sb1.length());
        sb1.append(" Russell");
        System.out.println(sb1.toString());
        sb1.indexOf(" Russell");
        sb1.insert(7, " Williams ");    // starts from 7th index
        sb1.setCharAt(6, 'R');  // sets char at the mentioned position
        sb1.setLength(30);  // 30 + 16
        System.out.println(sb1);
        System.out.println(sb1.capacity());

        //String Buffer is thread safe and String Builder is not.
    }
}
