package cool.but.leetcode.mock

import java.util.stream.Stream

//interface DataStreamWrapperGenerator<T> {
//    fun <S: Any> wrapOf(generator: Stream<S>): T<S>
//}


//class ArrayStreamGenerator : DataStreamWrapperGenerator<Array<Any>> {
//
//    override fun <S: Any> wrapOf(generator: Stream<S>): Array<S> {
//        return generator.limit(10).toArray()
//    }
//}

class ArrayStreamGenerator {
    fun <S> wrapOf(generator: Stream<S>): Array<S> {
        @Suppress("UNCHECKED_CAST")
        return generator.limit(10).toArray() as Array<S>
    }
}