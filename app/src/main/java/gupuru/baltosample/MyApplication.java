package gupuru.baltosample;

import android.app.Application;

import com.goodpatch.feedbacktool.sdk.Balto;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Balto.init(this);
    }

}