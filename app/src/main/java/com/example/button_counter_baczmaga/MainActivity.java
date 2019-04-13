package com.example.button_counter_baczmaga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Counter counter;
    private Button addbutton;
    private Button subbutton;
    private Button resetbutton;
    private TextView countview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addCount(View view){

        counter.addCount();
        countview.setText(counter.toString());

    }
    public void deincrementCount(View view){

        counter.subCount();
        countview.setText((counter.toString()));

    }
    public void resetCount(View view){

        counter.resetCount();
        countview.setText(counter.toString());

    }

}
