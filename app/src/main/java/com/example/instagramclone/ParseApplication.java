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
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("6Y1W4DRSOBbhsK6g5gcsGpdNXtWAYPHxrZtwVuCS")
                .clientKey("khOVvuME09PHoo7bKljoPKf7by1AWLvaSVsglhSm")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
