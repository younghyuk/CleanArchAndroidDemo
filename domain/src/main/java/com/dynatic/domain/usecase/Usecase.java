package com.dynatic.domain.usecase;

public interface Usecase<Input, Output> {
    void execute(Input input, Callback<Output> output);

    interface Callback<T> {
        void onCallback(T output);
    }
}
