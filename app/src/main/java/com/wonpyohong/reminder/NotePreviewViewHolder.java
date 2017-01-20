package com.wonpyohong.reminder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.wonpyohong.reminder.model.Note;

public class NotePreviewViewHolder extends RecyclerView.ViewHolder {
	@BindView(R.id.note_title)
	TextView titleTextView;

	@BindView(R.id.note_body)
	TextView bodyTextView;

	NotePreviewViewHolder(View itemView) {
		super(itemView);

		ButterKnife.bind(this, itemView);
	}

	void bind(Note note) {
		titleTextView.setText(note.getTitle());
		bodyTextView.setText(note.getBody());
	}
}
