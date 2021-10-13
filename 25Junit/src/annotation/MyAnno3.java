package annotation;
import java.lang.annotation.*;
/**
  @ProjectName: basic-code
 * @Author: 19818
 * @Date: 2020/5/11 18:5
 * @Target: 描述注解能够作用的位置
*  @Retention: 描述注解被保留的阶段
*  @Documented: 描述注解是否被抽取到api文档
*  @Inherited: 描述注解是否被子类继承
*/
@SuppressWarnings("true")
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})//表示该MyAnno3注解只能作用与类上
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnno3 {

}
