package com.example.avoiddit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    private ScrollView mPostList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPostList = findViewById(R.id.postList);
    }
}
