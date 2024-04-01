import cool.but.leetcode.mock.MockContext
import org.junit.jupiter.api.Test

/**
 * Description <br>
 *
 * @author 0027026774 <br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2024/4/1 <br>
 * @see  <br>
 * @since V8.1E <br>
 */
class MockContextTest {
    @Test
    fun testBasic() {
        println(MockContext.mock(Int::class.java))
    }

    @Test
    fun testArray() {
        println(MockContext.mock(Array::class.java))
    }
}