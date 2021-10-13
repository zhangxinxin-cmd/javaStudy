package demo03Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo02Filter {
    public static void main(String[] args) {
        getAllFiles(new File("D:\\java\\java knowledge\\包"));
    }
    public static void getAllFiles(File dir){
        /*File[] files = dir.listFiles(file -> {
            if(file.isDirectory()) return true;
            return file.getName().toLowerCase().endsWith(".java");
        });*/
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                return new File(file, s).isDirectory() || s.toLowerCase().endsWith(".java");
            }
        });
        //使用Lambda表达式优化
        /*File[] files = dir.listFiles((file,s)->{
            return new File(file,s).isDirectory()||s.toLowerCase().endsWith(".java");
        });*/
        assert files != null;
        for (File file : files) {
            if(file.isDirectory()){
                getAllFiles(file);
            }else{
                System.out.println(file);
            }
        }
    }
}
