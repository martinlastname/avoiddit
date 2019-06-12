package com.example.avoiddit.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.avoiddit.PostListAdapter;
import com.example.avoiddit.R;
import com.example.avoiddit.model.PostBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    // Constants for use as keys when adding data to Intents.
    public static final String EXTRA_TITLE = "com.example.avoiddit.TITLE";
    public static final String EXTRA_CONTENT = "com.example.avoiddit.TITLE";

    ArrayList<String> testMobileArray = new ArrayList<String>(Arrays.asList("Android", "Linux", "IPhone", "Zune", "WindowsMobile", "Roku",
            "Blackberry", "PHP", "WebOS", "Padding", "Ubuntu", "Pillow Fortran", "Windows7",
            "Nintendo Switch", "Max OS X"));

    ArrayList<PostBlock> mPostList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        populatePostList();

        PostListAdapter adapter = new PostListAdapter(this, android.R.layout.simple_list_item_1, mPostList);

        ListView postList = findViewById(R.id.postList);
        postList.setAdapter(adapter);
    }

    private void populatePostList(){
        for(int i = 0; i < 24; i++){
            mPostList.add(new PostBlock("item: " + (i + 1), "content: " + (100 - i)));
        }

    }

    public void onPostItemClick(View view){
        Intent intent = new Intent(this, PostPageActivity.class);
        TextView title = view.findViewById(R.id.textView_Title);
        TextView content = findViewById(R.id.textView_Description);
        intent.putExtra(EXTRA_TITLE, title.getText().toString());
        intent.putExtra(EXTRA_CONTENT, content.getText().toString());
        startActivity(intent);
    }
}
