package com.wonpyohong.reminder;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import junit.framework.Assert;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 21,
	constants = BuildConfig.class)
public class MainActivityTest {

	private MainActivity mainActivity;

	@Before
	public void setUp() throws Exception {
		mainActivity = Robolectric.setupActivity(MainActivity.class);
	}

	@Test
	public void title_is_Reminder() {
		// given

		// when

		// then
		Assert.assertEquals(mainActivity.getTitle(), "Reminder");
	}

	@Test
	public void recyclerView_존재해야함() throws Exception {
		// given

		// when

		// then
		Assert.assertNotNull(mainActivity.recyclerView);
	}
}