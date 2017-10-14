package chapter1;

public class Practice3 {

    public static void main(String[] args) {

        // すべての文字列
        System.out.println(".*");

        // 最初の1文字はA、2文字目は数字、2文字目は数字か無し
        System.out.println("A¥d{1,2}");

        // 最初の1文字はU、2〜4文字目は英大文字
        System.out.println("U[A-Z]{3}");

    }

}
