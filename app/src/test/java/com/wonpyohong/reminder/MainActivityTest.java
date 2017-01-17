package com.wonpyohong.reminder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import android.app.Activity;
import junit.framework.Assert;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 21,
	constants = BuildConfig.class)
public class MainActivityTest {
	@Test
	public void onCreateTest() throws Exception {
		// given

		// when
		Robolectric.setupActivity(MainActivity.class);

		// then
	}

	@Test
	public void title_is_Reminder() {
		// given

		// when
		Activity mainActivity = Robolectric.setupActivity(MainActivity.class);

		// then
		Assert.assertEquals(mainActivity.getTitle(), "Reminder");
	}
}