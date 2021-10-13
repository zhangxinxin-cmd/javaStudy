package demo03;
import java.util.Scanner;

public class Demo10ArrayParam {
    //int IndexLeft=0;

    public int[] create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length:");
        int length = sc.nextInt();
        int[] array = new int[length];

        System.out.println("Input:");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public void reverse(int[] array) {
        int IndexLeft = 0;
        int IndexRight = array.length - 1;
        int temp;
        for (IndexLeft = 0; IndexLeft < array.length / 2; IndexLeft++) {
            temp = array[IndexLeft];
            array[IndexLeft] = array[IndexRight];
            array[IndexRight] = temp;
            IndexRight -= 1;
        }
    }

    public void arrayPrint(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i!=array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
