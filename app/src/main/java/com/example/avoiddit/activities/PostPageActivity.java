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
        Log.d("ACTIVITY TITLE ---", title);
        String content = intent.getStringExtra(MainActivity.EXTRA_CONTENT);
        Log.d("ACTIVITY CONTENT ---", content);
        String body = title + "\n" + content;
        TextView textView = findViewById(R.id.textView_postActivity_title);
        textView.setText(body);
    }
}
