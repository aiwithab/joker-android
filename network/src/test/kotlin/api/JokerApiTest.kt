package api

import com.aiwithab.network.JokerClient
import junit.framework.Assert.assertNotNull
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.Test

class JokerApiTest {

    private val jokerClient = JokerClient()


    @Test
    fun getRandomJokeTest(){

        CoroutineScope(Dispatchers.IO).launch {

            val joke = jokerClient.api.getRandomJoke()

            assertNotNull(joke.body()?.id)
        }

    }

}