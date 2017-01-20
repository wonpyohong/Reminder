package com.wonpyohong.reminder;

import java.util.List;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wonpyohong.reminder.model.Note;

public class NotePreviewListAdapter extends RecyclerView.Adapter<NotePreviewViewHolder> {
	private final Context context;
	final List<Note> noteList;

	public NotePreviewListAdapter(Context context, List<Note> noteList) {
		this.context = context;
		this.noteList = noteList;
	}

	@Override
	public NotePreviewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View itemView = LayoutInflater.from(context).inflate(R.layout.note_preview, parent, false);
		return new NotePreviewViewHolder(itemView);
	}

	@Override
	public void onBindViewHolder(NotePreviewViewHolder holder, int position) {
		holder.bind(noteList.get(position));
	}

	@Override
	public int getItemCount() {
		return noteList.size();
	}
}
