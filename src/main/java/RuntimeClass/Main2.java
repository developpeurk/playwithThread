package RuntimeClass;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import static java.lang.System.out;

public class Main2 {
    public static void main(String[] args) {
        Stream.of(Optional.ofNullable(null)).findFirst().ifPresent(out::println);
        Set<String> colors = new HashSet<>();
        colors.add("yellow");
        colors.add("blue");
        colors.add("yellow");
        colors.stream().sorted((a1,a2) -> a1.compareTo(a2));
        out.println(colors);


        Runtime m= Runtime.getRuntime();
        out.println("Total memory space = " + m.totalMemory());
        out.println("Free memory space = " + m.freeMemory());
        out.println("MAX memory space = " + m.maxMemory());

        for (int i = 0; i < 2000000 ; i++) {
            new Main2();
        }

        out.println("Free memory space after run the app = " + m.freeMemory());
        System.gc();
        out.println("Free memory space after run the GC = " + m.freeMemory());

    }
}
