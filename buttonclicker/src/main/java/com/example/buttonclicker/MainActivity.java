package com.example.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button whoAmIBtn;
    private Button itIsNotMeBtn;
    private CheckBox switchingCheckBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.studentTextView);
        whoAmIBtn = findViewById(R.id.whoAmIbtn);
        itIsNotMeBtn = findViewById(R.id.itIsNotMeBtn);
        switchingCheckBox = findViewById(R.id.switchingCheckBox);
        View.OnClickListener whoAmIOclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Мой номер по списку 13 (Климин АВ)");
            }
        };
        whoAmIBtn.setOnClickListener(whoAmIOclBtn);

    }

    public void onItIsNotMeBtnClick(View view){
        textView.setText("Это не я сделал");
        switchingCheckBox.setChecked(!switchingCheckBox.isChecked());
    }
}