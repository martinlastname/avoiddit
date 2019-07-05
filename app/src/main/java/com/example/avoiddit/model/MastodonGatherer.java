package com.example.avoiddit.model;

import com.example.avoiddit.UserPreferences;
import com.google.gson.Gson;
import com.sys1yagi.mastodon4j.MastodonClient;
import com.sys1yagi.mastodon4j.MastodonRequest;
import com.sys1yagi.mastodon4j.api.Pageable;
import com.sys1yagi.mastodon4j.api.Range;
import com.sys1yagi.mastodon4j.api.entity.Status;
import com.sys1yagi.mastodon4j.api.exception.Mastodon4jRequestException;
import com.sys1yagi.mastodon4j.api.method.Timelines;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;

public class MastodonGatherer implements Gatherer {

    private MastodonClient client;
    private Timelines timelines;

    public MastodonGatherer(){
        client = new MastodonClient.Builder("mstdn.jp",
                new OkHttpClient.Builder(), new Gson()).build();
        timelines = new Timelines(client);
    }

    @Override
    public ArrayList<PostBlock> gather(int count) {
        String title = "";
        String content = "";
        ArrayList<PostBlock> list = new ArrayList<>();

        try{
             MastodonRequest<Pageable<Status>> request = timelines.getHome();
             Pageable<Status> pageable = request.execute();
             List<Status> statuses = pageable.getPart();

             for (Status status : statuses){
                content = status.getContent();
                list.add(new PostBlock(title, content));
            }
        }
        catch (Mastodon4jRequestException e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public void UpdatePreferences(UserPreferences preferences) {

    }

    @Override
    public UserPreferences getPreferences() {
        return null;
    }
}
