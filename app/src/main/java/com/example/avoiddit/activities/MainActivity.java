package com.example.avoiddit.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.avoiddit.PostListAdapter;
import com.example.avoiddit.R;
import com.example.avoiddit.model.PostBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> mobileArray = new ArrayList<String>(Arrays.asList("Android", "Linux", "IPhone", "Zune", "WindowsMobile", "Roku",
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
}
