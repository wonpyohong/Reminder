package com.wonpyohong.reminder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.Shadows;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.wonpyohong.reminder.model.Note;

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

	@Test
	public void bind() throws Exception {
		// given
		Note note = new Note("testTitle", "testBody");

		// when
		notePreviewViewHolder.bind(note);

		// then
		Assert.assertEquals("testTitle", Shadows.shadowOf(notePreviewViewHolder.titleTextView).innerText());
		Assert.assertEquals("testBody", Shadows.shadowOf(notePreviewViewHolder.bodyTextView).innerText());
	}
}