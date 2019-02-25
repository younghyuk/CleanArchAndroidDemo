package com.dynatic.data.datasource;

import com.dynatic.data.model.AdRequest;
import com.dynatic.data.model.AdResponse;

public class AdNetworkDatasource implements AdDatasource {
    @Override
    public void loadAd(AdRequest adRequest, Callback callback) {
        // Do Network Request using adRequest.
        // And then invoke callback
        callback.onLoaded(new AdResponse());
    }
}
