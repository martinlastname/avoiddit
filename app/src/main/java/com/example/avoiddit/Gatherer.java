package com.example.avoiddit;

import com.example.avoiddit.model.PostBlock;

import java.util.ArrayList;

/**
 * @author MartinLastname
 */
public interface Gatherer {

    /**
     * Gathers and returns a list of posts based on the object's stored UserPreferences.
     *
     * @param count Number of posts to gather. Negative values are treated as '0'.
     * @return List of PostBlock objects with filled 'title' and 'content' fields.
     */
    public ArrayList<PostBlock> gather(int count);

    /**
     * Replaces currently stored preferences with a new UserPreferences object.
     *
     * @param preferences
     */
    public void UpdatePreferences(UserPreferences preferences);

    public UserPreferences getPreferences();

}
