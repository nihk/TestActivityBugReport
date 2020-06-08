package ca.nick.testactivity

import android.app.Activity
import androidx.test.core.app.launchActivity
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TestActivityTest {

    @Test
    fun runMe() {
        launchActivity<TestActivity>()
        assertTrue(true)
    }
}

class TestActivity : Activity()