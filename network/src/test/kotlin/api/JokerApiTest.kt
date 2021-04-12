package api

import com.aiwithab.network.JokerClient
import junit.framework.Assert.assertNotNull
import org.junit.Test

class JokerApiTest {

    private val jokerClient = JokerClient()


    @Test
    fun getRandomJokeTest(){
        val joke = jokerClient.api.getRandomJoke().execute()
        assertNotNull(joke.body()?.id)
    }

}