package com.moringaschool.motormax;


import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.CoreMatchers.not;

import android.view.View;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MotorMaxActivityInstrumentationTest {
    @Rule
    public ActivityScenarioRule<MotorMaxActivity> activityTestRule =
            new ActivityScenarioRule<>(MotorMaxActivity.class);

        private View activityDecorView;

        @Before
    public void setUp() {
            activityTestRule.getScenario().onActivity(new ActivityScenario.ActivityAction<MotorMaxActivity>() {
                @Override
                public void perform(MotorMaxActivity activity) {
                }
            });
        }

        @Test
    public void listItemClickDisplaysToastWithCorrectMotorModel() {
            String motorModelName = "Toyota";
            onData(anything())
                    .inAdapterView(withId(R.id.listView))
                    .atPosition(0)
                    .perform(click());
            onView(withText(motorModelName)).inRoot(withDecorView(not(activityDecorView)))
                    .check(matches(withText(motorModelName)));
        }
}
