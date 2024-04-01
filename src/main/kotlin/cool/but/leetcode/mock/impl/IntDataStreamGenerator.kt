package cool.but.leetcode.common.mock.impl

import cool.but.leetcode.common.mock.DataStreamGenerator
import kotlin.random.Random

class IntDataStreamGenerator : DataStreamGenerator<Int> {
    override fun next(): Int {
        return Random.nextInt(100)
    }
}
