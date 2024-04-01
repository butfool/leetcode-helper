package cool.but.leetcode.common.mock

import cool.but.leetcode.common.mock.impl.IntDataStreamGenerator

class DataStreamContext {
    private var generatorMap: MutableMap<Class<*>, DataStreamGenerator<*>> = mutableMapOf(
        Int::class.java to IntDataStreamGenerator(),
        Integer::class.java to IntDataStreamGenerator()
    )

    fun <T> nextOf(type: Class<T>): T {
        var rawType: Class<*> = type
        if (type.isArray) {
            rawType = type.componentType
        }
        if (!generatorMap.containsKey(rawType)) {
            throw RuntimeException("No such type: $rawType")
        }
        return if (rawType == type) {
            @Suppress("UNCHECKED_CAST")
            (generatorMap[type] as DataStreamGenerator<T>).next()
        } else {
            ArrayStreamGenerator().wrapOf(
                (generatorMap[rawType] as DataStreamGenerator<Any>).stream()
            ) as Array<rawType>
        }
    }
}