package com.flexath.notes.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tJ\u0012\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tR(\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/flexath/notes/data/NoteViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/databinding/Observable;", "repo", "Lcom/flexath/notes/data/NoteRepository;", "(Lcom/flexath/notes/data/NoteRepository;)V", "noteList", "Landroidx/lifecycle/LiveData;", "", "Lcom/flexath/notes/data/room/NoteEntity;", "getNoteList", "()Landroidx/lifecycle/LiveData;", "setNoteList", "(Landroidx/lifecycle/LiveData;)V", "addOnPropertyChangedCallback", "", "callback", "Landroidx/databinding/Observable$OnPropertyChangedCallback;", "deleteNote", "Lkotlinx/coroutines/Job;", "note", "insertNote", "removeOnPropertyChangedCallback", "updateNote", "app_debug"})
public final class NoteViewModel extends androidx.lifecycle.ViewModel implements androidx.databinding.Observable {
    private final com.flexath.notes.data.NoteRepository repo = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<java.util.List<com.flexath.notes.data.room.NoteEntity>> noteList;
    
    public NoteViewModel(@org.jetbrains.annotations.NotNull()
    com.flexath.notes.data.NoteRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<java.util.List<com.flexath.notes.data.room.NoteEntity>> getNoteList() {
        return null;
    }
    
    public final void setNoteList(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<java.util.List<com.flexath.notes.data.room.NoteEntity>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertNote(@org.jetbrains.annotations.NotNull()
    com.flexath.notes.data.room.NoteEntity note) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateNote(@org.jetbrains.annotations.NotNull()
    com.flexath.notes.data.room.NoteEntity note) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteNote(@org.jetbrains.annotations.NotNull()
    com.flexath.notes.data.room.NoteEntity note) {
        return null;
    }
    
    @java.lang.Override()
    public void addOnPropertyChangedCallback(@org.jetbrains.annotations.Nullable()
    androidx.databinding.Observable.OnPropertyChangedCallback callback) {
    }
    
    @java.lang.Override()
    public void removeOnPropertyChangedCallback(@org.jetbrains.annotations.Nullable()
    androidx.databinding.Observable.OnPropertyChangedCallback callback) {
    }
}