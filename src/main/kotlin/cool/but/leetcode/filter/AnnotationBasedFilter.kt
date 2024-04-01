package cool.but.leetcode.common.filter

import java.util.stream.Stream

interface AnnotationBasedFilter<T> {
    fun filter(stream: Stream<T>): Stream<T>? {
        return stream.filter(this::filter)
    }
    fun filter(data: T): Boolean
}