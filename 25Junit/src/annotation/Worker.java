package annotation;

/**
 * @ProjectName: basic-code
 * @Author: 19818
 * @Date: 2020/5/11 18:10
 */
@MyAnno(value = 2, per = Person.p1, anno2 = @MyAnno2, strs = {"ad","ds"})//当仅有value时，可省略value
@MyAnno3
public class Worker {
    @MyAnno3  //报错
    public String name;
    @MyAnno3 // 报错
    public void show(){

    }
}
