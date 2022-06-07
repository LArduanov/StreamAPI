import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args){

        List<String> list = List.of("Ivan","Bob","Peter","Bob","Tom","Jerry");
        Stream<String> listStream = list.stream();
//        list.stream().forEach(System.out::println);
//        System.out.println(listStream.count());
//        System.out.println(listStream.reduce((x,y) -> x + y));
//        System.out.println(listStream.findFirst());
        System.out.println(
                listStream
                        .map(String::toUpperCase)
                        .distinct()
                        .sorted()
                        .limit(4)
                        .skip(2)
                        .collect(Collectors.toList())

        );



        IntStream intStream = IntStream.range(0,100);
//        intStream.forEach(System.out::println);
//        System.out.println(intStream.count());
//        System.out.println(intStream.reduce((x,y) -> x + y));
//        System.out.println(intStream.findFirst());
//        System.out.println(intStream.allMatch(x -> x <= 100));
//        System.out.println(intStream.anyMatch(x -> x > 90));
//        System.out.println(intStream.noneMatch(x -> x > 99));
        System.out.println(
                intStream
                        .filter(x -> x > 80)
                        .map(x -> x * 2)
                        .sorted()
                        .skip(10)
                        .distinct()
                        .limit(3)
                        .findFirst()
        );
    }
}
