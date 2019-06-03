package com.example.avoiddit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.avoiddit.model.PostBlock;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

// TODO change to <PostBlock>
public class PostListAdapter extends ArrayAdapter<PostBlock> {

    private Context mContext;
    private List<PostBlock> contentList;

    public PostListAdapter(Context context, int resource, ArrayList<PostBlock> list) {
        super(context, resource, list);
        mContext = context;
        contentList = list;
    }

    public void add(PostBlock object){

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItem = convertView;
        if(listItem == null){
            listItem = LayoutInflater.from(mContext).inflate(R.layout.layout_post, parent, false);
        }

        TextView title = listItem.findViewById(R.id.textView_Title);
        title.setText(contentList.get(position).getTitle());

        TextView description = listItem.findViewById(R.id.textView_Description);
        description.setText(contentList.get(position).getDescription());


        return listItem;
    }
}
