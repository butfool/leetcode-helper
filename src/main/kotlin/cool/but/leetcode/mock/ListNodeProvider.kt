package cool.but.leetcode.common.mock

import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import java.util.stream.Stream

class ListNodeProvider {
    class LIST_NODE : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
            TODO("Not yet implemented")
        }
    }

    class BI_LIST_NODE : ArgumentsProvider {
        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
            TODO("Not yet implemented")
        }
    }
}