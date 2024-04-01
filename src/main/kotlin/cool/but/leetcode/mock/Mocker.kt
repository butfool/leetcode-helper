package cool.but.leetcode.mock

interface Mocker<T> {
    fun mock(config: MockConfig): T
}