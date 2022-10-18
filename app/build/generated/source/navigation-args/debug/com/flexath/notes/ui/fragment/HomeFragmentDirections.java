package com.flexath.notes.ui.fragment;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.flexath.notes.R;
import com.flexath.notes.data.room.NoteEntity;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeToNote() {
    return new ActionOnlyNavDirections(R.id.action_home_to_note);
  }

  @NonNull
  public static ActionHomeToUpdate actionHomeToUpdate() {
    return new ActionHomeToUpdate();
  }

  public static class ActionHomeToUpdate implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionHomeToUpdate() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeToUpdate setNote(@Nullable NoteEntity note) {
      this.arguments.put("note", note);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("note")) {
        NoteEntity note = (NoteEntity) arguments.get("note");
        if (Parcelable.class.isAssignableFrom(NoteEntity.class) || note == null) {
          __result.putParcelable("note", Parcelable.class.cast(note));
        } else if (Serializable.class.isAssignableFrom(NoteEntity.class)) {
          __result.putSerializable("note", Serializable.class.cast(note));
        } else {
          throw new UnsupportedOperationException(NoteEntity.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      } else {
        __result.putSerializable("note", null);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_home_to_update;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public NoteEntity getNote() {
      return (NoteEntity) arguments.get("note");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeToUpdate that = (ActionHomeToUpdate) object;
      if (arguments.containsKey("note") != that.arguments.containsKey("note")) {
        return false;
      }
      if (getNote() != null ? !getNote().equals(that.getNote()) : that.getNote() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getNote() != null ? getNote().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeToUpdate(actionId=" + getActionId() + "){"
          + "note=" + getNote()
          + "}";
    }
  }
}
