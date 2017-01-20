package com.wonpyohong.reminder;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.wonpyohong.reminder.model.Note;
import junit.framework.Assert;

public class NotePreviewListAdapterTest extends BaseTest {

	private NotePreviewListAdapter notePreviewListAdapter;

	@Before
	public void setUp() throws Exception {
		List<Note> noteList = Arrays.asList(new Note("title1", "body1"), new Note("title2", "body2"));
		notePreviewListAdapter = new NotePreviewListAdapter(noteList);
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
}