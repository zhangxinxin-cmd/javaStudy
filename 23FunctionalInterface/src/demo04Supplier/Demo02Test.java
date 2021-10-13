package demo04Supplier;
import java.util.function.Supplier;

public class Demo02Test {

    public static void main(String[] args) {
        int[] arr={12,22,11,131,121,343};
        int Max = getMax(() -> {
            int max = 0;
            for (int i : arr) {
                if (i >max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(Max);
    }
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
