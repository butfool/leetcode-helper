package cool.but.leetcode.mock

class MockException(
    override val message: String? = null,
    override val cause: Throwable? = null
) : RuntimeException(message, cause)