package demo01Junit;

public class Calculator2 {
    @Check
    public void add(){
        String str=null;
        String string = str.toString();
        System.out.println("1+0="+(1+0));
    }
    @Check
    public void sub(){
        System.out.println("1*0="+(1*0));
    }
    @Check
    public void divide(){
        System.out.println("1/0="+(1/0));
    }
}
