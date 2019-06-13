package com.example.avoiddit.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.avoiddit.R;

public class PostPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_page);

        Intent intent = getIntent();
        String title = intent.getStringExtra(MainActivity.EXTRA_TITLE);
        String content = intent.getStringExtra(MainActivity.EXTRA_CONTENT);

        TextView textView_title = findViewById(R.id.textView_postActivity_title);
        TextView textView_content = findViewById(R.id.textView_postActivity_Content);

        textView_title.setText(title);
        textView_content.setText(content);
    }
}
