package com.example.myapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testClickButtonIsDisplayed() {
        onView(withId(R.id.clickButton))
            .check(matches(isDisplayed()))
    }

    @Test
    fun testWelcomeTextIsDisplayed() {
        onView(withId(R.id.welcomeText))
            .check(matches(isDisplayed()))
    }

    @Test
    fun testButtonClickShowsToast() {
        onView(withId(R.id.clickButton))
            .perform(click())
            
        // Check if toast with "Button clicked 1 times!" is shown
        onView(withText("Button clicked 1 times!"))
            .inRoot(ToastMatcher())
            .check(matches(isDisplayed()))
    }
}

// Custom matcher for Toast messages
class ToastMatcher : org.hamcrest.TypeSafeMatcher<android.view.Root>() {
    override fun describeTo(description: org.hamcrest.Description) {
        description.appendText("is toast")
    }

    override fun matchesSafely(root: android.view.Root): Boolean {
        val type = root.windowLayoutParams.get().type
        if (type == android.view.WindowManager.LayoutParams.TYPE_TOAST) {
            val windowToken = root.decorView.windowToken
            val appToken = root.decorView.applicationWindowToken
            if (windowToken === appToken) {
                return true
            }
        }
        return false
    }
} 