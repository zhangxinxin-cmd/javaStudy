package demo05ObjectMethodReference;
/*
    通过对象名引用成员方法
    使用前提是对象名是已经存在的,成员方法也是已经存在
    就可以使用对象名来引用成员方法
 */
public class Demo01ObjectMethodReference {
    public static void printString(printable p){
        p.print("hello world");
    }

    public static void main(String[] args) {
        printString((str)->{
            MethodRerObject obj=new MethodRerObject();
            obj.printUpperCaseString(str);
        });
        /*
            使用方法引用优化Lambda
            对象是已经存在的MethodRerObject
            成员方法也是已经存在的printUpperCaseString
            所以我们可以使用对象名引用成员方法
         */
        MethodRerObject obj=new MethodRerObject();
        printString(obj::printUpperCaseString);
    }
}
