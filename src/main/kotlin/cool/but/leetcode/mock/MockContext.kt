package cool.but.leetcode.mock

import cool.but.leetcode.mock.impl.ArrayMocker
import cool.but.leetcode.mock.impl.IntMocker

object MockContext {

    private var mockerMap: MutableMap<Class<*>, Mocker<*>> = mutableMapOf(
        Int::class.java to IntMocker(),
        Array::class.java to ArrayMocker(),
    )

    fun <T> mock(type: Class<T>): T {
        val mockConfig = MockConfig()
        if (!mockerMap.containsKey(type)) {
            throw MockException("Can not mock type: $type")
        }
        @Suppress("UNCHECKED_CAST")
        return mockerMap[type]!!.mock(mockConfig) as T
    }


    fun <T> canMock(type: Class<T>): Boolean {
        TODO()
    }


}