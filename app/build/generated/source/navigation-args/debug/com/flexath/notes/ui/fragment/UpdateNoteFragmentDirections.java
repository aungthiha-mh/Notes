package com.flexath.notes.ui.fragment;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.flexath.notes.R;

public class UpdateNoteFragmentDirections {
  private UpdateNoteFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionUpdateToHome() {
    return new ActionOnlyNavDirections(R.id.action_update_to_home);
  }
}
