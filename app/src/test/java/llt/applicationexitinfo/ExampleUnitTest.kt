package llt.applicationexitinfo

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
class ExampleUnitTest {

    @Test
    @Config(sdk = [29])
    fun addition_isCorrect_29() {
        assertEquals(4, 2 + 2)
    }


    @Test
    @Config(sdk = [30])
    fun addition_isCorrect_30() {
        assertEquals(4, 2 + 2)
    }
}