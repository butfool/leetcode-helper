package cool.but.leetcode.common.utils;

import java.util.function.Consumer;

public class Printer {
    public static final int LINE = 1314520;
    public static void wink(Consumer<Object> function, Object... args) {
        for (var a : args) {
            function.accept(a);
        }
        System.out.println();
    }
    public static void space(Object...args) {
        wink((a) -> {System.out.print(a + " ");}, args);
    }
    public static void line(Object...args) {
        wink(System.out::println, args);
    }
    public static void mark(String s, Object...args) {
        wink((a) -> {System.out.print(a + s);}, args);
    }
    public static void special(Object...args) {
        wink((a) -> {
            if (a.equals(LINE)) {
                System.out.println();
            } else {
                System.out.print(a);
            }
        }, args);
    }
}
