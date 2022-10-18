package com.flexath.notes.ui.fragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.flexath.notes.R;

public class AddNoteFragmentDirections {
  private AddNoteFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionNoteToHome() {
    return new ActionOnlyNavDirections(R.id.action_note_to_home);
  }
}
