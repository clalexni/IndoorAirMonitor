package com.raywenderlich.android.majesticreader.presentation.airMonitor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lcom/raywenderlich/android/majesticreader/presentation/airMonitor/AirMonitorViewModel;", "Lcom/raywenderlich/android/majesticreader/framework/MajesticViewModel;", "application", "Landroid/app/Application;", "interactors", "Lcom/raywenderlich/android/majesticreader/framework/Interactors;", "(Landroid/app/Application;Lcom/raywenderlich/android/majesticreader/framework/Interactors;)V", "_airMonitor", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/appCore/domain/AirMonitor;", "_pm10_0", "", "_pm2_5", "airMonitor", "Landroidx/lifecycle/LiveData;", "getAirMonitor", "()Landroidx/lifecycle/LiveData;", "pm10_0", "getPm10_0", "pm2_5", "getPm2_5", "setDeviceName", "", "name", "", "updateAirMonitor", "app_debug"})
public final class AirMonitorViewModel extends com.raywenderlich.android.majesticreader.framework.MajesticViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _pm2_5 = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Double> _pm10_0 = null;
    private final androidx.lifecycle.MutableLiveData<com.example.appCore.domain.AirMonitor> _airMonitor = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Double> getPm2_5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Double> getPm10_0() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.appCore.domain.AirMonitor> getAirMonitor() {
        return null;
    }
    
    public final void setDeviceName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void updateAirMonitor() {
    }
    
    public AirMonitorViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.majesticreader.framework.Interactors interactors) {
        super(null, null);
    }
}