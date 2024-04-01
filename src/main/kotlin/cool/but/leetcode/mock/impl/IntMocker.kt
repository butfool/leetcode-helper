package cool.but.leetcode.mock.impl

import cool.but.leetcode.mock.MockConfig
import cool.but.leetcode.mock.Mocker
import kotlin.random.Random

class IntMocker : Mocker<Int> {
    override fun mock(config: MockConfig): Int {
        return Random.nextInt(100)
    }
}
