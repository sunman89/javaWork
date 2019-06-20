package com.example.sonny.criminalintent;

import java.util.UUID;

/**
 * Created by Sonny on 16/03/2017.
 */

public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime(){
        // Generate Unique Identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
