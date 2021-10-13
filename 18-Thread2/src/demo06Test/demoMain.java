package demo06Test;

public class demoMain {
    public static void main(String[] args) {
        BaoZi bz=new BaoZi();
        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
