package cool.but.leetcode.common.annotations

import kotlin.reflect.KClass

annotation class AnnotationFilter(
    val value: KClass<out Annotation>
)
