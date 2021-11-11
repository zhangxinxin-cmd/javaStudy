package demo06Test;

public class demoMain {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        BaoZiPu baoZiPu = new BaoZiPu(bz);
        ChiHuo chiHuo = new ChiHuo(bz);
        baoZiPu.start();
        chiHuo.start();
    }
}
