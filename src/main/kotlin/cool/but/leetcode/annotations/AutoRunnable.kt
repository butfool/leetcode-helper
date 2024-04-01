package cool.but.leetcode.common.annotations

import cool.but.leetcode.common.provider.AutoRunnableArgumentProvider
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ArgumentsSource

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@ParameterizedTest
@ArgumentsSource(AutoRunnableArgumentProvider::class)
annotation class AutoRunnable
