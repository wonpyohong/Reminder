package com.wonpyohong.reminder;

import java.util.List;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.wonpyohong.reminder.model.Note;

public class NotePreviewListAdapter extends RecyclerView.Adapter<NotePreviewViewHolder> {
	private final List<Note> noteList;

	public NotePreviewListAdapter(List<Note> noteList) {
		this.noteList = noteList;
	}

	@Override
	public NotePreviewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		return null;
	}

	@Override
	public void onBindViewHolder(NotePreviewViewHolder holder, int position) {

	}

	@Override
	public int getItemCount() {
		return noteList.size();
	}
}
