package cool.but.leetcode.common

class MockException(
    override val message: String?,
    override val cause: Throwable?
) : RuntimeException(message, cause)