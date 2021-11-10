package demo01Exception;

/*
java.lang.Throwable:类是java语言中所有错误或异常的超类。
        Exception:编译器异常，进行编译（写代码）java程序出现的问题
        RuntimeException:运行期异常，java程序运行过程中出现的问题
        异常就相当于程序得了一个小毛病（感冒，发烧），八一厂处理掉，程序可以继续执行（吃点药，继续革命工作）
        Error错误：
            错误就相当于程序得了一个无法治愈的毛病（费电，艾滋），必须修改源代码，程序才能继续执行
 */
public class Demo01Exception {
    public static void main(String[] args) {
        //Exception:编译期异常,进行编译(写代码)java程序出现的问题
        /*SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        Date date = null;//把字符串格式的日期,解析为Date格式的日期
        try {
            date = sdf.parse("2013年11月21日04时321秒");
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("后续代码。");
        }
        System.out.println(date);*/
        int[] array = {12, 22, 32};
        try {
            System.out.println(array[3]);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
