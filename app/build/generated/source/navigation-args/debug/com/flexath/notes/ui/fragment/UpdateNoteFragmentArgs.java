package com.flexath.notes.ui.fragment;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import com.flexath.notes.data.room.NoteEntity;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class UpdateNoteFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private UpdateNoteFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private UpdateNoteFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings({
      "unchecked",
      "deprecation"
  })
  public static UpdateNoteFragmentArgs fromBundle(@NonNull Bundle bundle) {
    UpdateNoteFragmentArgs __result = new UpdateNoteFragmentArgs();
    bundle.setClassLoader(UpdateNoteFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("note")) {
      NoteEntity note;
      if (Parcelable.class.isAssignableFrom(NoteEntity.class) || Serializable.class.isAssignableFrom(NoteEntity.class)) {
        note = (NoteEntity) bundle.get("note");
      } else {
        throw new UnsupportedOperationException(NoteEntity.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      __result.arguments.put("note", note);
    } else {
      __result.arguments.put("note", null);
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static UpdateNoteFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    UpdateNoteFragmentArgs __result = new UpdateNoteFragmentArgs();
    if (savedStateHandle.contains("note")) {
      NoteEntity note;
      note = savedStateHandle.get("note");
      __result.arguments.put("note", note);
    } else {
      __result.arguments.put("note", null);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public NoteEntity getNote() {
    return (NoteEntity) arguments.get("note");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("note")) {
      NoteEntity note = (NoteEntity) arguments.get("note");
      if (Parcelable.class.isAssignableFrom(NoteEntity.class) || note == null) {
        __result.set("note", Parcelable.class.cast(note));
      } else if (Serializable.class.isAssignableFrom(NoteEntity.class)) {
        __result.set("note", Serializable.class.cast(note));
      } else {
        throw new UnsupportedOperationException(NoteEntity.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    } else {
      __result.set("note", null);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    UpdateNoteFragmentArgs that = (UpdateNoteFragmentArgs) object;
    if (arguments.containsKey("note") != that.arguments.containsKey("note")) {
      return false;
    }
    if (getNote() != null ? !getNote().equals(that.getNote()) : that.getNote() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getNote() != null ? getNote().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "UpdateNoteFragmentArgs{"
        + "note=" + getNote()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull UpdateNoteFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public UpdateNoteFragmentArgs build() {
      UpdateNoteFragmentArgs result = new UpdateNoteFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setNote(@Nullable NoteEntity note) {
      this.arguments.put("note", note);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @Nullable
    public NoteEntity getNote() {
      return (NoteEntity) arguments.get("note");
    }
  }
}
