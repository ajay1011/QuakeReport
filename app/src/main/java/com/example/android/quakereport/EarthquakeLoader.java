package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by AJAY OMKAR on 16-Dec-16.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    private String murl;
    /** Tag for log messages */
    private static final String LOG_TAG = EarthquakeLoader.class.getName();
    public EarthquakeLoader(Context context,String url){
        super(context);
        this.murl = url;

    }
    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        // Don't perform the request if there are no URLs, or the first URL is null.
        if ( murl == null) {
            return null;
        }

        List<Earthquake> result = QueryUtils.extractEarthquakes(murl);
        return result;
    }
}
