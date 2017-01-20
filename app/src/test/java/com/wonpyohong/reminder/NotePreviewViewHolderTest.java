package com.wonpyohong.reminder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import android.view.View;

public class NotePreviewViewHolderTest extends BaseTest {

	private NotePreviewViewHolder notePreviewViewHolder;

	@Before
	public void setUp() throws Exception {
		View view = Mockito.mock(View.class);
		notePreviewViewHolder = new NotePreviewViewHolder(view);
	}

	@Test
	public void notNull() throws Exception {
		// given

		// when

		// then
		Assert.assertNotNull(notePreviewViewHolder);
	}
}