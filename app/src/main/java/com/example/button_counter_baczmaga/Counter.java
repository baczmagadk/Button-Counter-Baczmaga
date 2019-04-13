package com.example.button_counter_baczmaga;

import java.util.ArrayList;

public class Counter {

    private int count;

    public Counter() {
        this.count = 0;
    }

    public void addCount() {
        this.count++;
    }

    public void subCount() {
        this.count--;
    }

    public void resetCount() {
        this.count = 0;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return Integer.toString(this.count);
    }
}
