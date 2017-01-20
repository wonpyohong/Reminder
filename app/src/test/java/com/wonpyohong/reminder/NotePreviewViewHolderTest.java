package com.wonpyohong.reminder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.robolectric.RuntimeEnvironment;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

public class NotePreviewViewHolderTest extends BaseTest {

	private NotePreviewViewHolder notePreviewViewHolder;

	@Before
	public void setUp() throws Exception {
		FrameLayout frameLayout = new FrameLayout(RuntimeEnvironment.application);
		View view = LayoutInflater.from(RuntimeEnvironment.application).inflate(R.layout.note_preview, frameLayout);
		notePreviewViewHolder = new NotePreviewViewHolder(view);
	}

	@Test
	public void notNull() throws Exception {
		// given

		// when

		// then
		Assert.assertNotNull(notePreviewViewHolder);
	}

	@Test
	public void titleTextView_notNull() throws Exception {
		// given

		// when

		// then
		Assert.assertNotNull(notePreviewViewHolder.titleTextView);
	}

	@Test
	public void bodyTextView_notNull() throws Exception {
		// given

		// when

		// then
		Assert.assertNotNull(notePreviewViewHolder.bodyTextView);
	}
}