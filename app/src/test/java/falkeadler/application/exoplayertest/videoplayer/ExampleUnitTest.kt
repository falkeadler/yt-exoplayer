package falkeadler.application.exoplayertest.videoplayer

import falkeadler.application.exoplayertest.videoplayer.list.NewYoutubeExtractor
import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        NewYoutubeExtractor().apply {
            videoId = "c1XJIopJXwo"
        }.extract()
    }
}