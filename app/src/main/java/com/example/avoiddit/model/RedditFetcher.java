package com.example.avoiddit.model;


import com.github.jreddit.entity.Submission;
import com.github.jreddit.entity.User;
import com.github.jreddit.retrieval.Submissions;
import com.github.jreddit.retrieval.params.SubmissionSort;
import com.github.jreddit.utils.restclient.HttpRestClient;
import com.github.jreddit.utils.restclient.RestClient;


import java.util.List;

public class RedditFetcher {

    private String userN;
    private String passW;
    private RestClient mrestClient;
    private User muser;

    public RedditFetcher(String inUserN, String inPassW) {
        this.userN = inUserN;
        this.passW = inPassW;
        this.mrestClient = new HttpRestClient();
        mrestClient.setUserAgent("bot/1.0 by name");

        muser = new User(mrestClient, userN, passW);
        try {
            muser.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Submission> getTenPosts(String subreddit) {
        Submissions subms = new Submissions(mrestClient, muser);

        return subms.ofSubreddit(subreddit, SubmissionSort.HOT, -1, 10, null, null, true);
    }

}
