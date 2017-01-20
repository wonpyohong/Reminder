package com.wonpyohong.reminder;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class NotePreviewListAdapterTest extends BaseTest {

	private NotePreviewListAdapter notePreviewListAdapter;

	@Before
	public void setUp() throws Exception {
		notePreviewListAdapter = new NotePreviewListAdapter();
	}

	@Test
	public void notNull() throws Exception {
		// given

		// when

		// then
		Assert.assertNotNull(notePreviewListAdapter);
	}
}