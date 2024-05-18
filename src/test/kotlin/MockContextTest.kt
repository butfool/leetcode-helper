import cool.but.leetcode.common.annotations.AutoRunnable
import org.junit.jupiter.api.Test
import java.util.*

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
    @AutoRunnable
    fun testBasic(a:Int, b: Double) {
        println("$a, $b")
    }

    @AutoRunnable
    fun testArray(a: List<Int>) {
        println(a)
    }
}