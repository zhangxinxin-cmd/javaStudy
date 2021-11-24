package demo03Filter;

import java.io.File;

public class Demo02Filter {
    public static void main(String[] args) {
        getAllFiles(new File("D:\\java\\java knowledge\\包"));
    }

    public static void getAllFiles(File dir) {
        //使用Lambda表达式优化
        /*File[] files = dir.listFiles((file, s) -> {
            return new File(file, s).isDirectory() || s.toLowerCase().endsWith(".java");
        });*/
        File[] files = dir.listFiles((file -> file.isDirectory() || file.getName().endsWith(".java")));
        if (files == null) {
            return;
        }
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFiles(file);
            } else {
                System.out.println(file);
            }
        }
    }
}
