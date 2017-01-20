package com.wonpyohong.reminder;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.robolectric.RuntimeEnvironment;

import android.widget.FrameLayout;
import com.wonpyohong.reminder.model.Note;
import junit.framework.Assert;

public class NotePreviewListAdapterTest extends BaseTest {

	private NotePreviewListAdapter notePreviewListAdapter;

	@Before
	public void setUp() throws Exception {
		List<Note> noteList = Arrays.asList(new Note("title1", "body1"), new Note("title2", "body2"));
		notePreviewListAdapter = new NotePreviewListAdapter(RuntimeEnvironment.application, noteList);
	}

	@Test
	public void notNull() throws Exception {
		// given

		// when

		// then
		Assert.assertNotNull(notePreviewListAdapter);
	}

	@Test
	public void getItemCount() throws Exception {
		// given

		// when

		// then
		Assert.assertEquals(notePreviewListAdapter.getItemCount(), 2);
	}

	@Test
	public void onCreateViewHolder() throws Exception {
		// given
		FrameLayout frameLayout = new FrameLayout(RuntimeEnvironment.application);

		// when
		NotePreviewViewHolder notePreviewViewHolder =
			notePreviewListAdapter.onCreateViewHolder(frameLayout, 0);

		// then
		Assert.assertNotNull(notePreviewViewHolder);
	}

	@Test
	public void onBindViewHolder() throws Exception {
		// given
		NotePreviewViewHolder mockedViewHolder = Mockito.mock(NotePreviewViewHolder.class);
		int position = 0;

		// when
		notePreviewListAdapter.onBindViewHolder(mockedViewHolder, position);

		// then
		Mockito.verify(mockedViewHolder).bind(notePreviewListAdapter.noteList.get(position));
	}
}