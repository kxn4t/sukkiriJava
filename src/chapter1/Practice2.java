package chapter1;

import java.io.File;
import java.nio.file.Paths;

public class Practice2 {

    public static void main(String[] args) {

        // フォルダ名
        String folder1 = "c:" + File.separator + "javadev";
        String folder2 = "c:" + File.separator + "user" + File.separator;
        // ファイル名
        String file = "readme.txt";

        // Pathsで生成
        String path1 = Paths.get(folder1, file).toString();
        String path2 = Paths.get(folder2, file).toString();

        System.out.println(path1);
        System.out.println(path2);
    }
}