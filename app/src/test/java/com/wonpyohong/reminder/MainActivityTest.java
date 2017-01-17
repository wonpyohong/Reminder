package com.wonpyohong.reminder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 21,
	constants = BuildConfig.class)
public class MainActivityTest {
	@Test
	public void onCreateTest() throws Exception {
		Robolectric.setupActivity(MainActivity.class);
	}
}