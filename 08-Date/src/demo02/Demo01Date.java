package demo02;
/*
java.util.Date：表示日期和时间的类。
类：Date 表示特定的瞬间，精确到毫秒。
毫秒；千分之一秒

注意：中国属于东八区，会把时间增加8个小时。
 */
public class Demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前系统时间到1970年一月一日00：00经历了多少时间。
    }
}
