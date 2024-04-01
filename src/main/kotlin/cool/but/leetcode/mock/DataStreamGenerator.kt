package cool.but.leetcode.common.mock

import java.util.stream.Stream

interface DataStreamGenerator<T> {
    fun next(): T
    fun stream(): Stream<T> {
        return Stream.generate(this::next)
    }
}
