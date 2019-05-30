package com.example.avoiddit.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;

import com.example.avoiddit.R;
import com.example.avoiddit.model.RedditFetcher;
import com.github.jreddit.entity.Submission;
import com.github.jreddit.retrieval.Submissions;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button fetchRedButton = findViewById(R.id.testerButton);
        fetchRedButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                RedditFetcher testFetch = new RedditFetcher("IAmYourVader", "legoland123");
                List<Submission> postsList = testFetch.getTenPosts("ProgrammerHumor");
                System.out.println(postsList);
            }
        });
    }
}
