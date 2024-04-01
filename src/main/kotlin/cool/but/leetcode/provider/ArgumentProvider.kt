package cool.but.leetcode.common.provider

import cool.but.leetcode.common.annotations.AutoRunnable
import cool.but.leetcode.common.mock.DataStreamContext
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.provider.AnnotationBasedArgumentsProvider
import org.junit.jupiter.params.provider.Arguments
import java.lang.reflect.Parameter
import java.util.*
import java.util.stream.Stream


class AutoRunnableArgumentProvider : AnnotationBasedArgumentsProvider<AutoRunnable>() {

    private val dataStreamResolver: DataStreamContext = DataStreamContext()

    override fun provideArguments(context: ExtensionContext?, annotation: AutoRunnable): Stream<out Arguments> {
        val parameters = context?.testMethod?.get()?.parameters ?: emptyArray()
        val result = LinkedList<Any>()
        handleArguments(parameters)
        parameters.forEach {
            println(it.type)
            result.add(
                dataStreamResolver.nextOf(it.type)
            )
        }
        return Stream.of(Arguments.of(*(result.toArray())))
    }

    private fun handleArguments(parameters: Array<Parameter>) {

    }

}