package demo02Recursion;
import java.io.File;
/*
文件搜索
 */
public class Demo04Recursion {
    public static void main(String[] args) {
        getAllFiles2(new File("D:\\java\\java knowledge\\包"));
    }
    public static void getAllFiles2(File dir){
        File[] files = dir.listFiles();
        //System.out.println(dir);
        if(files==null) return;
        for (File file : files) {
            if(file.isDirectory()){
                getAllFiles2(file);
            }
            String name = file.getName();
//            String path = file.getPath();
            //把字符串转换为小写
            String s = name.toLowerCase();
            if(s.endsWith(".class")&&file.isFile()){//file.isFile()防止以.class结尾的文件夹也被打印
                System.out.println(file);
            }
        }
    }
}
