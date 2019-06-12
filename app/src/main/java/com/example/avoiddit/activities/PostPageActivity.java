package com.example.avoiddit.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.avoiddit.R;

public class PostPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_page);

        Intent intent = getIntent();
        String body = intent.getStringExtra(MainActivity.EXTRA_TITLE);
        TextView textView = findViewById(R.id.textView_Test);
        textView.setText(body);
    }
}
