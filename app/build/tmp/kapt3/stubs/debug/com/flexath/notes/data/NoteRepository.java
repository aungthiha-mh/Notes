package com.flexath.notes.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/flexath/notes/data/NoteRepository;", "", "dao", "Lcom/flexath/notes/data/room/NoteDao;", "(Lcom/flexath/notes/data/room/NoteDao;)V", "getAllNotes", "Landroidx/lifecycle/LiveData;", "", "Lcom/flexath/notes/data/room/NoteEntity;", "getGetAllNotes", "()Landroidx/lifecycle/LiveData;", "setGetAllNotes", "(Landroidx/lifecycle/LiveData;)V", "deleteNote", "", "note", "(Lcom/flexath/notes/data/room/NoteEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertNote", "updateNote", "app_debug"})
public final class NoteRepository {
    private final com.flexath.notes.data.room.NoteDao dao = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.flexath.notes.data.room.NoteEntity>> getAllNotes;
    
    public NoteRepository(@org.jetbrains.annotations.NotNull()
    com.flexath.notes.data.room.NoteDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.flexath.notes.data.room.NoteEntity>> getGetAllNotes() {
        return null;
    }
    
    public final void setGetAllNotes(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.flexath.notes.data.room.NoteEntity>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertNote(@org.jetbrains.annotations.NotNull()
    com.flexath.notes.data.room.NoteEntity note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateNote(@org.jetbrains.annotations.NotNull()
    com.flexath.notes.data.room.NoteEntity note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull()
    com.flexath.notes.data.room.NoteEntity note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}