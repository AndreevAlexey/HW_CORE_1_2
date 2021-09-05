package com.company;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
