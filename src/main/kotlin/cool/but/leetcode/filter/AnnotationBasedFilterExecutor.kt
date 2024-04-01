package cool.but.leetcode.common.filter

import cool.but.leetcode.common.filter.annotations.NonNegative
import cool.but.leetcode.common.filter.impl.NonNegativeFilter
import java.util.stream.Stream
import kotlin.reflect.KClass

class AnnotationBasedFilterExecutor(
) {
    private lateinit var filterMap: MutableMap<KClass<out Annotation>, AnnotationBasedFilter<*>>

    init {
        filterMap[NonNegative::class] = NonNegativeFilter() as AnnotationBasedFilter<*>
    }

    fun <T> execute(annotation: KClass<out Annotation>, stream: Stream<T>): Stream<T> {
        NonNegativeFilter().filter(Stream.of(1, 2, 3))
        return (filterMap[annotation] as AnnotationBasedFilter<T>).filter(stream)!!
    }
}