package com.example.myapp

import org.junit.Test
import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [33])
class MainActivityTest {
    private lateinit var activity: MainActivity

    @Before
    fun setup() {
        activity = Robolectric.buildActivity(MainActivity::class.java)
            .create()
            .resume()
            .get()
    }

    @Test
    fun `test activity is created successfully`() {
        assertNotNull(activity)
    }

    @Test
    fun `test click button is initialized`() {
        val clickButton = activity.findViewById<android.widget.Button>(R.id.clickButton)
        assertNotNull(clickButton)
    }

    @Test
    fun `test welcome text is initialized`() {
        val welcomeText = activity.findViewById<android.widget.TextView>(R.id.welcomeText)
        assertNotNull(welcomeText)
    }
} 