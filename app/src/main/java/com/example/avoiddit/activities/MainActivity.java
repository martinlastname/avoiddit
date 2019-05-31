package com.example.avoiddit.activities;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.github.jreddit.entity.Submission;

import com.example.avoiddit.R;
import com.example.avoiddit.model.RedditFetcher;

import java.util.ArrayList;
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
                FetchPostsTask task = new FetchPostsTask();
                task.execute("IamYourVader", "legoland123");

                //System.out.println(postsList);
            }
        });
    }


    private class FetchPostsTask extends AsyncTask<String, Void, List<Submission>> {
        private Exception exception;

        protected List<Submission> doInBackground(String...cred) {
            List<Submission> postsList = new ArrayList<>();
            try {
                String user = cred[0];
                String pass = cred[1];
                RedditFetcher testFetch = new RedditFetcher(user, pass);
                postsList = testFetch.getTenPosts("ProgrammerHumor");

            } catch (Exception e) {
                e.printStackTrace();
            }
            return postsList;
        }

        protected void onProgressUpdate() {
        }

        protected void onPostExectute(List<Submission> result) {
            Log.d("Reddit", result.toString());
        }
    }
}