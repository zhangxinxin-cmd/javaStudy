package demo03;
public class Demo08ArrayMax {
    public static void main(String[] args) {
        int[]array={1,2,21,12,13,22};
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}

