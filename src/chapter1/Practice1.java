package chapter1;

public class Practice1 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        // 1から100までの整数をカンマで連結
        for (int i = 1; i <= 100; i++) {
            sb.append(i).append(",");
        }

        String s = sb.toString();
        String[] a = s.split(",");

        // 表示
        for (String str : a) {
            System.out.println(str);
        }
    }

}
