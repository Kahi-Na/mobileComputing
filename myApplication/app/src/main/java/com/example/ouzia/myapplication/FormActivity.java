package com.example.ouzia.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity {

    Button buttonPrevious;
    EditText textViewName2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        buttonPrevious = findViewById(R.id.activity_two_button_previous);
        textViewName2 = findViewById(R.id.activity_two_textview_name);

        buttonPrevious.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                save();
            }
        });
    }


    private void save() {
        String name = textViewName2.getText().toString();
        DataManager.getInstance().addName(name);
        finish();
    }
}
