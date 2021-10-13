package demo02Recursion;

import java.io.File;

public class Demo03Recursion {
    public static void main(String[] args) {
       // getAllFiles(new File("D:\\idealProjects\\basic-code"));
        getAllFiles2(new File("D:\\java\\java knowledge\\包"));
        //geAllFiles3(new File("D:\\java\\java knowledge\\包"));
    }

    public static void getAllFiles(File dir){
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    public static void getAllFiles2(File dir){
        File[] files = dir.listFiles();
        System.out.println(dir);
        if(files==null) return;
        for (File file : files) {
            if(file.isDirectory()){
            getAllFiles2(file);
            }
            System.out.println(file);
        }
    }

    public static void geAllFiles3(File dir){
        File[] files = dir.listFiles();
        if(files==null){
            return;
        }
        for (File file : files) {
            System.out.println(file);
            geAllFiles3(file);
        }
    }
}
