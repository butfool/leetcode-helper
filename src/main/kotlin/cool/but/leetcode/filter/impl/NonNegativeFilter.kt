package cool.but.leetcode.common.filter.impl

import cool.but.leetcode.common.annotations.AnnotationFilter
import cool.but.leetcode.common.filter.AnnotationBasedFilter
import cool.but.leetcode.common.filter.annotations.NonNegative


@AnnotationFilter(NonNegative::class)
@Suppress("unused")
class NonNegativeFilter : AnnotationBasedFilter<Int> {
    override fun filter(data: Int): Boolean {
        return data >= 0
    }
}