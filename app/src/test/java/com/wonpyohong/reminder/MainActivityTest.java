package com.wonpyohong.reminder;

import org.junit.Before;
import org.junit.Test;
import org.robolectric.Robolectric;

import junit.framework.Assert;

public class MainActivityTest extends BaseTest {

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

	@Test
	public void recyclerViewAdapter_존재해야함() throws Exception {
		// given

		// when

		// then
		Assert.assertNotNull(mainActivity.recyclerView.getAdapter());
	}
}