package com.raywenderlich.android.majesticreader.framework;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001aJ\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0015H\u00c6\u0003J\t\u00105\u001a\u00020\u0017H\u00c6\u0003J\t\u00106\u001a\u00020\u0019H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0007H\u00c6\u0003J\t\u00109\u001a\u00020\tH\u00c6\u0003J\t\u0010:\u001a\u00020\u000bH\u00c6\u0003J\t\u0010;\u001a\u00020\rH\u00c6\u0003J\t\u0010<\u001a\u00020\u000fH\u00c6\u0003J\t\u0010=\u001a\u00020\u0011H\u00c6\u0003J\t\u0010>\u001a\u00020\u0013H\u00c6\u0003J\u0081\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u00c6\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020DH\u00d6\u0001J\t\u0010E\u001a\u00020FH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102\u00a8\u0006G"}, d2 = {"Lcom/raywenderlich/android/majesticreader/framework/Interactors;", "", "addBookmark", "Lcom/raywenderlich/android/majesticreader/interactors/AddBookmark;", "getBookmarks", "Lcom/raywenderlich/android/majesticreader/interactors/GetBookmarks;", "deleteBookmark", "Lcom/raywenderlich/android/majesticreader/interactors/RemoveBookmark;", "addDocument", "Lcom/raywenderlich/android/majesticreader/interactors/AddDocument;", "getDocuments", "Lcom/raywenderlich/android/majesticreader/interactors/GetDocuments;", "removeDocument", "Lcom/raywenderlich/android/majesticreader/interactors/RemoveDocument;", "getOpenDocument", "Lcom/raywenderlich/android/majesticreader/interactors/GetOpenDocument;", "setOpenDocument", "Lcom/raywenderlich/android/majesticreader/interactors/SetOpenDocument;", "readAirQuality", "Lcom/example/airqualitymonitoring/interactors/ReadAirQuality;", "readPM2_5", "Lcom/example/airqualitymonitoring/interactors/ReadPM2_5;", "readPM10_0", "Lcom/example/airqualitymonitoring/interactors/ReadPM10_0;", "setMonitorDeviceName", "Lcom/example/airqualitymonitoring/interactors/SetMonitorDeviceName;", "(Lcom/raywenderlich/android/majesticreader/interactors/AddBookmark;Lcom/raywenderlich/android/majesticreader/interactors/GetBookmarks;Lcom/raywenderlich/android/majesticreader/interactors/RemoveBookmark;Lcom/raywenderlich/android/majesticreader/interactors/AddDocument;Lcom/raywenderlich/android/majesticreader/interactors/GetDocuments;Lcom/raywenderlich/android/majesticreader/interactors/RemoveDocument;Lcom/raywenderlich/android/majesticreader/interactors/GetOpenDocument;Lcom/raywenderlich/android/majesticreader/interactors/SetOpenDocument;Lcom/example/airqualitymonitoring/interactors/ReadAirQuality;Lcom/example/airqualitymonitoring/interactors/ReadPM2_5;Lcom/example/airqualitymonitoring/interactors/ReadPM10_0;Lcom/example/airqualitymonitoring/interactors/SetMonitorDeviceName;)V", "getAddBookmark", "()Lcom/raywenderlich/android/majesticreader/interactors/AddBookmark;", "getAddDocument", "()Lcom/raywenderlich/android/majesticreader/interactors/AddDocument;", "getDeleteBookmark", "()Lcom/raywenderlich/android/majesticreader/interactors/RemoveBookmark;", "getGetBookmarks", "()Lcom/raywenderlich/android/majesticreader/interactors/GetBookmarks;", "getGetDocuments", "()Lcom/raywenderlich/android/majesticreader/interactors/GetDocuments;", "getGetOpenDocument", "()Lcom/raywenderlich/android/majesticreader/interactors/GetOpenDocument;", "getReadAirQuality", "()Lcom/example/airqualitymonitoring/interactors/ReadAirQuality;", "getReadPM10_0", "()Lcom/example/airqualitymonitoring/interactors/ReadPM10_0;", "getReadPM2_5", "()Lcom/example/airqualitymonitoring/interactors/ReadPM2_5;", "getRemoveDocument", "()Lcom/raywenderlich/android/majesticreader/interactors/RemoveDocument;", "getSetMonitorDeviceName", "()Lcom/example/airqualitymonitoring/interactors/SetMonitorDeviceName;", "getSetOpenDocument", "()Lcom/raywenderlich/android/majesticreader/interactors/SetOpenDocument;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class Interactors {
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.interactors.AddBookmark addBookmark = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.interactors.GetBookmarks getBookmarks = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.interactors.RemoveBookmark deleteBookmark = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.interactors.AddDocument addDocument = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.interactors.GetDocuments getDocuments = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.interactors.RemoveDocument removeDocument = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.interactors.GetOpenDocument getOpenDocument = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.majesticreader.interactors.SetOpenDocument setOpenDocument = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.airqualitymonitoring.interactors.ReadAirQuality readAirQuality = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.airqualitymonitoring.interactors.ReadPM2_5 readPM2_5 = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.airqualitymonitoring.interactors.ReadPM10_0 readPM10_0 = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.airqualitymonitoring.interactors.SetMonitorDeviceName setMonitorDeviceName = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.AddBookmark getAddBookmark() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.GetBookmarks getGetBookmarks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.RemoveBookmark getDeleteBookmark() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.AddDocument getAddDocument() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.GetDocuments getGetDocuments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.RemoveDocument getRemoveDocument() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.GetOpenDocument getGetOpenDocument() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.SetOpenDocument getSetOpenDocument() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.airqualitymonitoring.interactors.ReadAirQuality getReadAirQuality() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.airqualitymonitoring.interactors.ReadPM2_5 getReadPM2_5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.airqualitymonitoring.interactors.ReadPM10_0 getReadPM10_0() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.airqualitymonitoring.interactors.SetMonitorDeviceName getSetMonitorDeviceName() {
        return null;
    }
    
    public Interactors(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.AddBookmark addBookmark, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.GetBookmarks getBookmarks, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.RemoveBookmark deleteBookmark, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.AddDocument addDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.GetDocuments getDocuments, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.RemoveDocument removeDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.GetOpenDocument getOpenDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.SetOpenDocument setOpenDocument, @org.jetbrains.annotations.NotNull()
    com.example.airqualitymonitoring.interactors.ReadAirQuality readAirQuality, @org.jetbrains.annotations.NotNull()
    com.example.airqualitymonitoring.interactors.ReadPM2_5 readPM2_5, @org.jetbrains.annotations.NotNull()
    com.example.airqualitymonitoring.interactors.ReadPM10_0 readPM10_0, @org.jetbrains.annotations.NotNull()
    com.example.airqualitymonitoring.interactors.SetMonitorDeviceName setMonitorDeviceName) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.AddBookmark component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.GetBookmarks component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.RemoveBookmark component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.AddDocument component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.GetDocuments component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.RemoveDocument component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.GetOpenDocument component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.interactors.SetOpenDocument component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.airqualitymonitoring.interactors.ReadAirQuality component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.airqualitymonitoring.interactors.ReadPM2_5 component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.airqualitymonitoring.interactors.ReadPM10_0 component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.airqualitymonitoring.interactors.SetMonitorDeviceName component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.majesticreader.framework.Interactors copy(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.AddBookmark addBookmark, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.GetBookmarks getBookmarks, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.RemoveBookmark deleteBookmark, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.AddDocument addDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.GetDocuments getDocuments, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.RemoveDocument removeDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.GetOpenDocument getOpenDocument, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.interactors.SetOpenDocument setOpenDocument, @org.jetbrains.annotations.NotNull()
    com.example.airqualitymonitoring.interactors.ReadAirQuality readAirQuality, @org.jetbrains.annotations.NotNull()
    com.example.airqualitymonitoring.interactors.ReadPM2_5 readPM2_5, @org.jetbrains.annotations.NotNull()
    com.example.airqualitymonitoring.interactors.ReadPM10_0 readPM10_0, @org.jetbrains.annotations.NotNull()
    com.example.airqualitymonitoring.interactors.SetMonitorDeviceName setMonitorDeviceName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}