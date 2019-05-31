package com.example.avoiddit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.avoiddit.model.PostBlock;

import java.util.List;

public class PostListAdapter extends ArrayAdapter<PostBlock> {

    private Context mContext;


    public PostListAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
    }

    public void add(PostBlock object){

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItem = convertView;
        if(listItem == null){
            listItem = LayoutInflater.from(mContext).inflate(R.layout.post_layout, parent, false);
        }


        return listItem;
    }
}
