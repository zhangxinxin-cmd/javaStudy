package demo02GetStream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法_map:用于类型转换
    如果需要将流中的元素映射到另一个流中，可以使用map方法.
    <R> Stream<R> map(Function<? super T, ? extends R> mapper);
    该接口需要一个Function函数式接口参数，可以将当前流中的T类型数据转换为另一种R类型的流。
    Function中的抽象方法:
        R apply(T t);
 */
public class Demo04Stream_Map {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(2, 1, 32, 21, 12);
        Stream<String> stream2 = stream.map((s)->String.valueOf(s));
        stream2.forEach((str)-> System.out.println(str));
    }
}
