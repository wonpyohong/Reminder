package com.wonpyohong.reminder;

import java.util.Arrays;
import java.util.List;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.wonpyohong.reminder.model.Note;

public class MainActivity extends AppCompatActivity {
	@BindView(R.id.recyclerView)
	RecyclerView recyclerView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ButterKnife.bind(this);

		List<Note> noteList = Arrays.asList(new Note("title1", "body1"), new Note("title2", "body2"));
		recyclerView.setAdapter(new NotePreviewListAdapter(this, noteList));
	}
}
