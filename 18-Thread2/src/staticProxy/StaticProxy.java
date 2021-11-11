package staticProxy;
/*
* 静态代理模式
* */
public class StaticProxy implements Marry {
    private Marry marry;

    public StaticProxy() {
    }

    public StaticProxy(Marry marry) {
        this.marry = marry;
    }

    public static void main(String[] args) {
        StaticProxy staticProxy = new StaticProxy(() -> {
            System.out.println("我结婚了");
        });
        staticProxy.marry();
    }

    @Override
    public void marry() {
        if (marry != null) {
            marry.marry();
        }
    }
}