package dmeo03Exception;

import java.util.List;

/*
异常的注意事项
 */
public class Demo01Exception {
    public static void main(String[] args) {
        /*
        1.多个异常使用捕获，该如何处理
        2.多个异常一次捕获，多次处理。
        3.多个异常一次捕获一次处理
         */
        /*int[] array={2,1,32};
        //1.多个异常使用捕获，该如何处理
        try{
        System.out.println(array[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        List<Integer> list=List.of(2,32,1,43,44);
        try{
        System.out.println(list.get(5));//ArrayIndexOutOfBoundsException
             }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("后续代码");*/
        int[] array={2,1,32};
        List<Integer> list=List.of(2,32,1,43,44);
       // 2.多个异常一次捕获，多次处理。
        try{
            System.out.println(array[3]);
            System.out.println(list.get(5));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        /*
        一个try多个catch注意事项：
            catch里边定义的异常变量，如果有子父类关系，那么子类的异常变量必须写在上边，否则会报错
            ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
         */
        //3.多个异常一次捕获一次处理
        try{
            System.out.println(array[3]);
            System.out.println(list.get(5));
        } catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
