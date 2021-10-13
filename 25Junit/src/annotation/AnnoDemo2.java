package annotation;
import java.util.Date;
/**
 * @ProjectName: basic-code
 * @Author: 19818
 * @Date: 2020/5/11 13:50
 */
@SuppressWarnings("all")
public class AnnoDemo2 {
    @Override
    public String toString() {
        return super.toString();
    }
    @Deprecated
    public void show1(){
        //有缺陷
    }
    public void show2(){

    }
    //@MyAnno
    public void demo(){
        show1();
        Date date=new Date();
    }
}
