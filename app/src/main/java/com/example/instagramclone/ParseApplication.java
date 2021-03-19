package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

       // ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("DTbftLxPRtOhBMtt75yzyj4wvIZ0SwAmkAd90jPS")
                .clientKey("s2jTf4iQ4xuAj86cFDe5vFReFdUgZfy45dQpfs22")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
