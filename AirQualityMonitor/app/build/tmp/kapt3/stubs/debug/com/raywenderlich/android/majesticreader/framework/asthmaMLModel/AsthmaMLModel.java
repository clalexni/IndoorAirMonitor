package com.raywenderlich.android.majesticreader.framework.asthmaMLModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J;\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010\u001a\u001a\u00020\tJ(\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/raywenderlich/android/majesticreader/framework/asthmaMLModel/AsthmaMLModel;", "Lcom/example/appCore/data/MLModelDataSource;", "()V", "mlModel", "Lcom/example/appCore/domain/MLModel;", "doInference", "", "", "interpreter", "Lorg/tensorflow/lite/Interpreter;", "temperature", "", "humidity", "", "pm2_5", "pm10_0", "(Lorg/tensorflow/lite/Interpreter;DIDD)[[F", "getMLOutput1", "getMLOutput2", "getMLResults", "loadModelFile", "Ljava/nio/ByteBuffer;", "assetManager", "Landroid/content/res/AssetManager;", "filename", "", "makeInterpreter", "predictMLResults", "", "app_debug"})
public final class AsthmaMLModel implements com.example.appCore.data.MLModelDataSource {
    private final com.example.appCore.domain.MLModel mlModel = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.appCore.domain.MLModel getMLResults() {
        return null;
    }
    
    @java.lang.Override()
    public double getMLOutput1() {
        return 0.0;
    }
    
    @java.lang.Override()
    public double getMLOutput2() {
        return 0.0;
    }
    
    @java.lang.Override()
    public void predictMLResults(double temperature, int humidity, double pm2_5, double pm10_0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.tensorflow.lite.Interpreter makeInterpreter() {
        return null;
    }
    
    private final java.nio.ByteBuffer loadModelFile(android.content.res.AssetManager assetManager, java.lang.String filename) throws java.io.IOException {
        return null;
    }
    
    private final float[][] doInference(org.tensorflow.lite.Interpreter interpreter, double temperature, int humidity, double pm2_5, double pm10_0) {
        return null;
    }
    
    public AsthmaMLModel() {
        super();
    }
}