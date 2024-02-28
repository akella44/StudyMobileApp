package com.example.control_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       CheckBox rememberCredsCheckBox = (CheckBox)findViewById(R.id.rememberCredCheckBox);
       rememberCredsCheckBox.setChecked(true);
    }
}