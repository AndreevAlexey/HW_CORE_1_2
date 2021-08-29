package com.company;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener callbackError;

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener callbackError) {
        this.callback = callback;
        this.callbackError = callbackError;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) callbackError.onError("Task " + i + " is Error!!!");
            else callback.onDone("Task " + i + " is done");
        }
    }
}