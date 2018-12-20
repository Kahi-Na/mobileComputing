package com.example.ouzia.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonNext;
    RecyclerView recyclerView;
    NameListeAdapter nameListeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameListeAdapter = new NameListeAdapter();

        initView();
        initList();
    }

    private void initView(){
        buttonNext = findViewById(R.id.activity_main_button_next);
        recyclerView = findViewById(R.id.recyclerview);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayFormActivity();
            }
        });

    }


    private void initList(){
        final LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(nameListeAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();

        nameListeAdapter.updateData(DataManager.getInstance().getNameList());
    }

    private void displayFormActivity() {
        Intent intent = new Intent(this, FormActivity.class);
        startActivity(intent);
    }

}
